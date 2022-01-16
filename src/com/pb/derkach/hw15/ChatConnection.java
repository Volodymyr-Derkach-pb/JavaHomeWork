package com.pb.derkach.hw15;

import java.io.*;
import java.net.Socket;

public class ChatConnection {

    private final Socket server;
    private final BufferedReader inServer;
    private final BufferedWriter outServer;
    private final Thread AcceptMessagesThread;
    private final ChatEvent mcEvent;

    public ChatConnection(Socket server, ChatEvent mcEvent) throws IOException {
        this.server = server;
        this.mcEvent = mcEvent;
        inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        outServer = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));

        AcceptMessagesThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mcEvent.onConnectionReady(ChatConnection.this);
                    while (!AcceptMessagesThread.isInterrupted()) {
                        String msg = inServer.readLine();
                        mcEvent.onReceiveString(ChatConnection.this, msg);
                    }

                } catch (IOException ex) {
                    mcEvent.onException(ChatConnection.this, ex);

                } finally {
                    mcEvent.onDisconnect(ChatConnection.this);

                }
            }
        }
        );
        AcceptMessagesThread.start();
    }

    public synchronized void sendMessage(String msg) {
        try {
            outServer.write(msg + "\n");
            outServer.flush();
        } catch (IOException ex) {
            mcEvent.onException(ChatConnection.this, ex);
            diconnect();
        }
    }

    public synchronized void diconnect() {
        AcceptMessagesThread.interrupt();
        try {
            outServer.close();
            inServer.close();
            server.close();
        } catch (IOException ex) {
            mcEvent.onException(ChatConnection.this, ex);
        }
    }
}

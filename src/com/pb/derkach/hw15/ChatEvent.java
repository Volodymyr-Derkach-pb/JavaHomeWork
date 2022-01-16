package com.pb.derkach.hw15;

public class ChatEvent {

    void onConnectionReady(ChatConnection mcConnection);

    void onReceiveString(ChatConnection mcConnection, String msg);

    void onDisconnect(ChatConnection mcConnection);

    void onException(ChatConnection mcConnection, Exception ex);
}

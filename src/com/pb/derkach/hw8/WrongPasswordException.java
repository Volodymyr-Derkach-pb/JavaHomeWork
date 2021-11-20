package com.pb.derkach.hw8;

public class WrongPasswordException extends Exception {
    private String detail;

    public WrongPasswordException() {
        detail = "неверный пароль";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }


}

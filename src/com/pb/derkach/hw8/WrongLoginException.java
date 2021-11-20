package com.pb.derkach.hw8;

public class WrongLoginException extends Exception {
    private String detail;

    public WrongLoginException() {
        detail = "неверный логин";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }


}

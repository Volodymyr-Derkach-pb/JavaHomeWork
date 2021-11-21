package com.pb.derkach.hw8;

/**
 *
 * WrongLoginException
 * 		пользовательские классы исключения с двумя конструкторами
 * 		один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.
 *
 * */

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

package com.pb.derkach.hw8;

/**
 *
 * WrongPasswordException
 * 		пользовательские классы исключения с двумя конструкторами
 *
 * */

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

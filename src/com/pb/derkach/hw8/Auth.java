package com.pb.derkach.hw8;

//import javax.swing.*;
//import java.awt.event.ActionEvent;

/**
 *
 * --поля
 * ---login
 * ---password
 *
 * --методы
 * ---signUp (Регистрация)
 * 		принимающий login, password, и confirmPassword.
 * 		Проверяет параметр login, длинна должна быть от 5 до 20 символов.
 * 		Login должен содержать только латинские буквы и цифры.
 * 		Если логин не соответствует требованиям нужно выбросить WrongLoginException.
 * 		Если проверки все пройдены успешно записать в свои поля значение login и password.
 * ---signIn (Авторизация)
 * 		принимающий login и password.
 * 		Проверяет что login и password соответствуют значениям из полей класса.
 * 		Если нет - выбрасывает исключение WrongLoginException.
 *
 * */

public class Auth {

    private String login;
    private String password;
    private String confirmPassword;

//    public Auth (String login, String password, String confirmPassword) {
//        this.login = login;
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//    }

    public Auth() {

    }

    //Регистрация
    private boolean signUp(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Неверный логин");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }
        return true;
    }


    //Авторизация
    private boolean signIn (String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Неверный логин");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Неверный пароль");
        }
        return true;
    }

    //проверка
//    public void checkСonditions() {
//        try {
//           // signIn(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{5,20}");
//
//        } catch (WrongLoginException | WrongPasswordException e) {
//
//        }
//    }



}

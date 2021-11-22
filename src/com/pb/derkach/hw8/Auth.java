package com.pb.derkach.hw8;




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
 *
 *
 * */

public class Auth {


    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLogin(login);
        checkPassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login) || !this.password.equals(password)) {
            throw new WrongLoginException("Не верный логин или пароль");
        }
    }

    private void checkLogin(String login) throws WrongLoginException {
        if (login.length() < 5) {
            throw new WrongLoginException("Логин должен содержать больше 5 символов");
        } else if (login.length() > 20) {
            throw new WrongLoginException("Логин должен содержать меньше 20 символов");
        } else if (!login.matches("[a-zA-Z0-9]*")) {
            throw new WrongLoginException("Логин может содержать только латинские буквы и цифры");
        }
    }

    private void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(password.length() < 5) {
            throw new WrongPasswordException("Пароль должен содержать более 5 символов");
        } else if (!password.matches("[_a-zA-Z0-9]*")) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и подчеркивание");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совпадает");
        }
    }


}

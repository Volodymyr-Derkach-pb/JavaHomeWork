package com.pb.derkach.hw8;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Auth {

    String login;
    String password;
    String confirmPassword;


    /**
     * класс Auth, который содержит поля login и password и методы:
     *
     * - signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
     * Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры. Если логин не соответствует требованиям нужно выбросить WrongLoginException.
     * Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания. Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
     * Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
     *
     * - signIn (вход на сайт) принимающий login и password.
     * Проверяет что login и password соответствуют значениям из полей класса.
     * Если нет - выбрасывает исключение WrongLoginException.
     *
     * */

    public void actionPerformed(ActionEvent ae) {
        try {
            checkLogInInfo(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{1,20}");
            JOptionPane.showMessageDialog(this, "Login and password are correct!",
                    "User login&password confirmation", JOptionPane.PLAIN_MESSAGE);
        } catch (WrongLoginException | WrongPasswordException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "UserException", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(regex)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches(regex) ||
                !confirmPassword.matches(regex) ||
                !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
        return true;
    }


}

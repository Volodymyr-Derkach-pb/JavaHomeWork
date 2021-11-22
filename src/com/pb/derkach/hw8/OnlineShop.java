package com.pb.derkach.hw8;

import java.util.Scanner;

/**
 *
 * класс OnlineShop
 * 		В main создать один объект класса Auth.
 *
 * Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
 * Обработать исключения методов signUp signIn с помощью блоков try-catch.
 *
 * */

public class OnlineShop {
    public static void main(String[] args) {


        Scanner sign = new Scanner(System.in);
        Auth auth = new Auth();
        String login;
        String password;
        String confirmPassword;

        boolean signedUp = false;
        boolean signedIn = false;

        System.out.println("-РЕГИСТРАЦИЯ-");
        System.out.println("Придумайте логин и пароль");
        System.out.println("Введите логин");
        login = sign.next();
        System.out.println("Введите пароль");
        password = sign.next();
        System.out.println("Повторите пароль");
        confirmPassword = sign.next();

        while (!signedUp) {
            try {
                auth.signUp(login, password, confirmPassword);
                signedUp = true;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                System.out.println("Для регистрации введите логин");
                login = sign.next();
            } catch (WrongPasswordException e) {
                System.out.println("Введите пароль");
                password = sign.next();
                System.out.println("Повторите пароль");
                confirmPassword = sign.next();
            }
        }

        System.out.println("Вы зарегистрированы");

        while (!signedIn) {
            System.out.println("Для входа на сайт введите логин");
            login = sign.next();
            System.out.println("Введите пароль");
            password = sign.next();
            try {
                auth.signIn(login, password);
                signedIn = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Авторизация успешна");



    }
}

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
        new Auth();

        String loginsignUp;
        String passwordsignUp;
        String confirmPasswordsignUp;

        String loginsignIn;
        String passwordsignIn;

        Scanner signUp = new Scanner(System.in);
        System.out.println("--------РЕГИСТРАЦИЯ-----");
        System.out.println("Придумайте логин");
        loginsignUp = signUp.nextLine();

        System.out.println("Придумайте пароль");
        passwordsignUp = signUp.nextLine();
        System.out.println("Повторите пароль");
        confirmPasswordsignUp = signUp.nextLine();

//        try {
//
//
//        } catch () {
//
//        }


        Scanner signIn = new Scanner(System.in);

        System.out.println("-----Аторизация--------");
        System.out.println("Веедите логин");
        loginsignIn = signIn.nextLine();

        System.out.println("Ведите пароль");
        passwordsignIn = signIn.nextLine();

    }



}

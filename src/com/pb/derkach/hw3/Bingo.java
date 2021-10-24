package com.pb.derkach.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int WholeNumber;
        //int WholeNumber1;
        Random random = new Random();
        int UserNumber;
        int attempt = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Угадайте целое число от 0 до 100");
        System.out.println("Для выхода из программы введите - 123");

        WholeNumber = random.nextInt(101); // вариант1

        // WholeNumber = (int)Math.floor(Math.random() * 100); // вариант2



        // System.out.println("WholeNumber : " + WholeNumber + " WholeNumber1 : " + WholeNumber1 ); //вывод
        do {
            attempt++;
            System.out.print("Введите Ваше целое число: (от 0 до 100)");
            UserNumber = input.nextInt();
            if (UserNumber > WholeNumber)
                System.out.println("Вы ввели число больше");
            else if (UserNumber < WholeNumber)
                System.out.println("Вы ввели число меньше ");

            else System.out.println("Вы угадали!");

        }
        while (UserNumber != WholeNumber);
        System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");


    }


}

package com.pb.derkach.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int WholeNumber;
        //int WholeNumber1;

        int UserNumber; //вводимое пользователем
        int attempt = 0; // Счетчик попыток.
        final int MAX_ATTEMPT = 10; // Допустимое количество попыток.

        Random random = new Random();


        Scanner input = new Scanner(System.in);

        System.out.println("Угадайте целое число от 0 до 100");
        System.out.println("Для выхода из программы введите - 123");

        WholeNumber = random.nextInt(101); // вариант1

        // WholeNumber = (int)Math.floor(Math.random() * 100); // вариант2 *101



        // System.out.println("WholeNumber : " + WholeNumber + " WholeNumber1 : " + WholeNumber1 ); //вывод


        //attempt < MAX_ATTEMPT
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            System.out.print("Введите Ваше целое число: (от 0 до 100)");
            UserNumber = input.nextInt();

            if (UserNumber == 123) {
                break;

            }
            if (UserNumber > WholeNumber) {
                System.out.println("Вы ввели число больше");
                continue;
            }
            if (UserNumber < WholeNumber) {
                System.out.println("Вы ввели число меньше ");
                continue;
            }

            if (UserNumber != WholeNumber) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");







    }


}

package com.pb.derkach.hw3;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];//создаем  массив размером 10
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();// заполняем массив с клавиатуры
        }

        //Вывести на экран введенный массив.


        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");// Выводим заполненый массив на экран
        }
        System.out.println();

        //Подсчитать сумму всех элементов массива и вывести ее на экран.


        // Подсчитать и вывести на экран количество положительных элементов.
        int num = 0;
        for (int i=0 ; i< mas.length; i++){
            if (mas[i]>0 ){
                num++;
            }
        }
        System.out.println("Количество элементов больше нуля  =  "+ num);

        // Произвести сортировку этого массива от меньшего к
        // большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)

        // Вывести на экран отсортированный массив.



    }

}

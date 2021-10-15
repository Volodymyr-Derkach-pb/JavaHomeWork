package com.pb.derkach.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        int numeric;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число (и нажмите enter) : ");
        numeric = scan.nextInt();

        //  4 интервала +1 5-й интервал  [0 -14] [15 - 35] [36 - 50] [51 - 100]

        if (numeric >= 0 && numeric <= 14) {
            System.out.print("Ваше число в интервале [0 -14]");
        } else if (numeric >= 15 && numeric <= 35) {
            System.out.print("Ваше число в интервале [15 - 35]");
        } else if (numeric >= 36 && numeric <= 50) {
            System.out.print("Ваше число в интервале [36 - 50]");
        } else if (numeric >= 51 && numeric <= 100) {
            System.out.print("Ваше число в интервале [51 - 100]");
        }else {
            System.out.print("Веденное Вами число не попадает в один из имеющихся промежутков ");
        }




    }
}

package com.pb.derkach.hw2;

import java.util.Scanner;
// создалл класс калькулятор
public class Calculator {
    // psvm
    public static void main(String[] args) {
        int operand1; // целочисленная переменная с именем operand1
        int operand2; // целочисленная переменная с именем operand2
        int resultat; // переменная с результатом
        char sign; // операция
        Scanner scan = new Scanner(System.in);
        System.out.print("введите 1-е целое число (и нажмите enter) : ");
        operand1 = scan.nextInt();
        System.out.print("введите 2-е целое число (и нажмите enter) : ");
        operand2 = scan.nextInt();
        System.out.print("Выберите действие: (сложить +, отнять -, умножить *, разделить / (и нажмите enter) ): ");
        sign = scan.next().charAt(0); //преобразование переменной
        switch(sign) {
            case '+': resultat = operand1 + operand2;
                break;
            case '-': resultat = operand1 - operand2;
                break;
            case '*': resultat = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.print("на 0 делить нельзя ");
                    return;
                }
                else {
                    resultat = operand1 / operand2;
                }
                resultat = operand1 / operand2;
                break;
            default:  System.out.printf("Ошибочка!!! Вы ввели неправильное действие");
                return;
        }

        System.out.printf("Вы ввели 1-е число " + operand1 + " 2-е число " + operand2 + " выбрали действие " + sign+ " результат : " + resultat); //+ resultat
    }
}
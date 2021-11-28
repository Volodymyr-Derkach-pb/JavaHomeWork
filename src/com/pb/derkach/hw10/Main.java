package com.pb.derkach.hw10;

public class Main {

    public static void main(String[] args) {
        {
            NumBox<Integer> integerBox = new NumBox<>(5);

            integerBox.add(7);
            integerBox.add(8);
            integerBox.add(5);
            integerBox.add(3);
            integerBox.add(-34);

            demo(integerBox);
        }

        System.out.println();

        {
            NumBox<Float> floatBox = new NumBox<>(5);

            floatBox.add(9f);
            floatBox.add(2f);
            floatBox.add(8.987f);
            floatBox.add(1f);
            floatBox.add(-.9f);

            demo(floatBox);
        }
    }

    public static void demo(NumBox<?> numBox) {

        System.out.println(numBox);

        int i = 2;
        System.out.printf("возвращающий число по индексу " + numBox.get(i) + "\n", i);

        System.out.println("возвращает текущее количество элементов" + numBox.length());
        System.out.println("подсчет среднего арифметического среди элементов массива" + numBox.average());
        System.out.println("сумма всех элементов массива " + numBox.sum());
        System.out.println("максимальный элемент массива " + numBox.max());
    }
}

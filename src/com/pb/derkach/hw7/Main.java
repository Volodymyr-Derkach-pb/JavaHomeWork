package com.pb.derkach.hw7;

public class Main
{
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XS, "темно-серый", 350),
                new Tshirt(Size.L, "черный", 250),
                new Pants(Size.M, "голубой", 500),
                new Pants(Size.XXS, "синий", 225),
                new Skirt(Size.S, "розовый", 400),
                new Skirt(Size.M, "красный", 520),
                new Tie(Size.L, "синий", 300),
                new Tie(Size.L, "красный", 280),
        };

        Atelier studio = new Atelier();
        studio.dressMan(clothes);
        System.out.println();
        studio.dressWomen(clothes);
    }
}

package com.pb.derkach.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "штаны[" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }
}

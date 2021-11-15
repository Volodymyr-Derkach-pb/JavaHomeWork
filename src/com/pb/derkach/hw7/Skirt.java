package com.pb.derkach.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, String color) {
        super(size, color);
    }

    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "юбка[" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }
}

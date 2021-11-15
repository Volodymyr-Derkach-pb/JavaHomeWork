package com.pb.derkach.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, String color) {
        super(size, color);
    }

    public Tie(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "галстук[" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }

}

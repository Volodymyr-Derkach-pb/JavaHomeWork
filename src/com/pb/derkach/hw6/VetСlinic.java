package com.pb.derkach.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian= new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog ("мясо и Каша", "Вольер");
        animals[1] = new Cat ("Молоко и рыба","Диван");
        animals[2] = new Horse("Сено","Конюшня");

        for (Animal animal : animals) {
            veterinarian.treadAnimal(animal);
        }
    }

}

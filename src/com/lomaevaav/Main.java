package com.lomaevaav;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Pushok", 10);
        cats[1] = new Cat("Vasya", 15);
        cats[2] = new Cat("Mursik", 30);
        cats[3] = new Cat("Barsik", 25);
        Plate plate = new Plate(70);
        plate.info();
        for (Cat cat:cats){
            cat.eat(plate);
            plate.info();
            cat.info();
        }
        plate.increaseFood(20);
        cats[3].eat(plate);
        plate.info();
        cats[3].info();
    }


}

package com.company.animals;

import java.util.Random;

public class Walketh extends Animal {

    protected int lengthClaws;
    Random r = new Random();


    public Walketh(int animalType, String name, String color, int size, String animalSound, String soundOfDying, long trus, int xPosition, int yPosition) {
        super(2, name, color, size, "топ-топ", "ой-ой-ой", 180000, xPosition, yPosition);
        this.lengthClaws = r.nextInt(3);
    }

    //TODO
}

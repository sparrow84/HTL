package com.company.animals;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int size;
    protected String animalSound;
    protected int satiety;

    public void move() {
        System.out.println(animalSound);
    }

    public void eat(Animal animal) {}
}

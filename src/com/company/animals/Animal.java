package com.company.animals;

import java.util.List;

public abstract class Animal {

    protected int animalType;
    protected String name;
    protected String color;
    protected int size;
    protected String animalSound;
    protected String soundOfDying;
    protected long trus;            // time remaining until starvation / сколько должно проийти времени до голодной смерти
    protected boolean fasts;        // голодает ли сейчас?
    protected int xPosition;
    protected int yPosition;
    protected List<Animal> animalsNearby;


    public Animal() {

    }

    public void move() {
        System.out.println(this.name + " " + animalSound);
        //TODO // How to move
    }

    public void eat(Animal animal) {
        if (this.animalType != animal.animalType && this.size > animal.size) {
            System.out.println(this.name + " ням-ням " + animal.name);
            animal.eaten();
            //TODO
        }
    }

    public void eaten() {
        System.out.println(this.name + " " + soundOfDying);
        //TODO
    }

    public void makeNewAnimal (Animal animal) {
        if (this.animalType == animal.animalType) {
            System.out.println("Родилось новое животное");
            //TODO
        }
    }



    public void printAnimal() {
        //TODO in child class
    }
}

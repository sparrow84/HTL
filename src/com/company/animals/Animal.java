package com.company.animals;

import java.util.*;

public abstract class Animal {

    protected static Set<String> allAnimalsName;

    protected int animalType;
    protected String name = "TEST_NAME";
    protected String color;
    protected int size;
    protected String animalSound = "TEST_SOUND";
    protected String soundOfDying;
    protected long trus;                // time remaining until starvation / сколько должно проийти времени до голодной смерти
    protected boolean fasts = false;            // голодает ли сейчас?
    protected int xPosition;
    protected int yPosition;
    protected List<Animal> animalsNearby; // Животные по бдизости доступные для действий
    protected int deltaMove = 3;
    protected Random random = new Random();

    public Animal(
            int animalType,
            String name,
            String color,
            int size,
            String animalSound,
            String soundOfDying,
            long trus,
            int xPosition,
            int yPosition
    ) {

        if (allAnimalsName == null)
            allAnimalsName = new TreeSet<>();

         if (allAnimalsName.contains(name)) {
             System.err.println("Животное с именем " + name + " уже есть.");
             return;
         }

        this.animalType = animalType;
        this.name = name;
        this.color = color;
        this.size = size;
        this.animalSound = animalSound;
        this.soundOfDying = soundOfDying;
        this.trus = trus;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

        allAnimalsName.add(this.name);
    }


    public int[] move() {
        System.out.println(this.name + " " + animalSound);

        int[] newCoordinates = new int[2];

        newCoordinates[0] = random.nextInt(deltaMove + 1);
        newCoordinates[1] = random.nextInt(deltaMove + 1);

        return newCoordinates;
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
        System.out.println("Имя: " + name + ", Цвет: " + color + ", Размер: " + size);
    }
}

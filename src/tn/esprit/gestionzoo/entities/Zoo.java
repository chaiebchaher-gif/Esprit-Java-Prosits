package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Zoo {
    private Animal[] animals = new Animal[7];
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private int nbrCages = 25;
    private int aquaticCount = 0;

    public Zoo() {}

    public Zoo(String city, int nbrCages) {
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // ... [Keep existing getters, setters, and general Animal array methods exactly as they were] ...

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Aquatic animal array is full.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    // ... [Keep the rest of the existing Zoo methods (displayZooInfo, isZooFull, addAnimal, searchAnimal, removeAnimal, compareZoo)] ...
}
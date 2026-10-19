package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myzoo = new Zoo();
        myzoo.setName("belvedaire");
        myzoo.setCity("Paris");
        myzoo.setNbrCages(10);

        // --- Instructions 25, 26, 27, 28 ---

        Dolphin dolphin1 = new Dolphin("Delphinidae", "Flipper", 6, true, "Ocean", 35.5f);
        Dolphin dolphin2 = new Dolphin("Delphinidae", "Echo", 4, true, "Ocean", 40.0f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Pingu", 2, true, "Iceberg", 50.0f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Skipper", 3, true, "Iceberg", 75.0f);

        myzoo.addAquaticAnimal(dolphin1);
        myzoo.addAquaticAnimal(dolphin2);
        myzoo.addAquaticAnimal(penguin1);
        myzoo.addAquaticAnimal(penguin2);

        System.out.println("\n--- Calling swim() on all aquatic animals ---");
        for (Aquatic a : myzoo.getAquaticAnimals()) {
            if (a != null) {
                a.swim();
            }
        }

        System.out.println("\n--- Max Penguin Swimming Depth ---");
        System.out.println("Maximum depth: " + myzoo.maxPenguinSwimmingDepth() + " meters.");

        System.out.println("\n--- Display Number Of Aquatics By Type ---");
        myzoo.displayNumberOfAquaticsByType();

        System.out.println("\n--- Testing equals() on Aquatics ---");
        Penguin identicalPenguin = new Penguin("Spheniscidae", "Pingu", 2, true, "Iceberg", 60.0f);
        System.out.println("Is penguin1 equal to identicalPenguin? " + penguin1.equals(identicalPenguin));
    }
}
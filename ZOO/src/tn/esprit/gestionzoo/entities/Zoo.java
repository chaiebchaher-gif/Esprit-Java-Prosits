package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Zoo {
    private Animal[] animals = new Animal[7];
    private String name;
    private String city;
    private int nbrCages = 25;

    public Zoo() {}

    public Zoo(String city, int nbrCages) {
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        while (name == null || name.trim().isEmpty()) {
            System.out.println("Name cannot be empty");
            System.out.println("Enter a valid name: ");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine();
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void displayzooInfo() {
        System.out.println("Zoo Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of Cages: " + this.nbrCages);
    }

    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    public boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo is full. Cannot add animal " + animal.getName() + ".");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                System.out.println("Animal " + animal.getName() + " already exists in the zoo.");
                return false;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Animal " + animal.getName() + " added to the zoo.");
                return true;
            }
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        System.out.println("Animal is not found");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                System.out.println("Animal " + animal.getName() + " removed from the zoo.");
                return true;
            }
        }
        System.out.println("Animal " + animal.getName() + " not found in the zoo.");
        return false;
    }

    public boolean compareZoo(Zoo zoo2) {
        int count1 = 0;
        int count2 = 0;
        for (Animal a : this.animals) {
            if (a != null) count1++;
        }
        for (Animal a : zoo2.animals) {
            if (a != null) count2++;
        }
        return count1 > count2;
    }
}
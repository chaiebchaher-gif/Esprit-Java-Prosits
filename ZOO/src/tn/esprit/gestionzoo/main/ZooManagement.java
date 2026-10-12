package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myzoo = new Zoo();
        myzoo.setName("belvedaire");
        myzoo.setCity("Paris");
        myzoo.setNbrCages(10);

        Zoo myzoo2 = new Zoo("London", 15);

        Animal lion = new Animal();
        lion.setFamily("Felidae");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setIsmammal(true);

        Animal elephant = new Animal("Elephantidae", "Elephant", true);
        myzoo.displayzooInfo();

        myzoo.addAnimal(lion);
        myzoo.addAnimal(elephant);

        Animal tiger = new Animal("Felidae", "Tiger", true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", false);
        myzoo.addAnimal(tiger);
        myzoo.addAnimal(crocodile);

        Animal giraffe = new Animal("Giraffidae", "Giraffe", true);
        Animal giraffe2 = new Animal("Giraffidae", "Giraffe", false);
        myzoo.addAnimal(giraffe);
        myzoo.addAnimal(giraffe);

        myzoo.displayAnimals();

        System.out.println(myzoo.searchAnimal(giraffe));
        System.out.println(myzoo.searchAnimal(giraffe2));
    }
}
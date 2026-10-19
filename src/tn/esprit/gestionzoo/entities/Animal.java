package tn.esprit.gestionzoo.entities;
import java.util.Scanner;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean ismammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        this.name = name;
        this.ismammal = ismammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age < 0) {
            System.out.println("Age cannot be negative");
            System.out.println("Enter a positive age: ");
            Scanner scanner = new Scanner(System.in);
            age = scanner.nextInt();
        }
        this.age = age;
    }

    public boolean isIsmammal() {
        return ismammal;
    }

    public void setIsmammal(boolean ismammal) {
        this.ismammal = ismammal;
    }

    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + ismammal + "]";
    }
}
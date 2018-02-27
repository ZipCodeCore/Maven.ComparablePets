package io.zipcoder.pets;

public class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    public int compareTo(Pet otherPet) {
        return this.name.compareTo(otherPet.getName());
    }
}

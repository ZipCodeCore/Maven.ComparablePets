package io.zipcoder.pets;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    public int compareTo(Pet otherPet) {
        return this.name.compareTo(otherPet.getName());

    }
}

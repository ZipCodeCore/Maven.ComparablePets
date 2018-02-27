package io.zipcoder.pets;

public class Capybara extends Pet {
    public Capybara(String name, int age) {
        super(name, age);
    }

    public int compareTo(Pet otherPet) {
        return this.name.compareTo(otherPet.getName());
    }
}

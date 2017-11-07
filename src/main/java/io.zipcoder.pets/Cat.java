package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String petName) {

        super(petName);
    }

    @Override
    public String speak() {

        return " says 'Meow!'";
    }

}
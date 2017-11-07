package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String petName) {

        super(petName);
    }

    @Override
    public String speak() {

        return " says 'Roooof!!!'";
    }

}

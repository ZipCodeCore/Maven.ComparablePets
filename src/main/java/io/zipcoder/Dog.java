package io.zipcoder;

public class Dog extends Pet {

    private String petName;

    public Dog(String petName) {
        this.petName = petName;
    }

    public String getName() {
        return this.petName;
    }

    @Override
    public String speak() {
        return "woof";
    }
}

package io.zipcoder;

public class Cat extends Pet {
    private String petName;

    public Cat(String petName) {
        this.petName = petName;
    }

    public String getName() {
        return this.petName;
    }

    @Override
    public String speak() {
        return "meow";
    }
}

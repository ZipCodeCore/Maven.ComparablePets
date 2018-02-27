package io.zipcoder;

public class Cat extends Pet {
    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "meow";
    }
}

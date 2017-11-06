package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

package io.zipcoder.pets;

public class Cat extends Pet {

    private String name;

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "Meow";
    }

}

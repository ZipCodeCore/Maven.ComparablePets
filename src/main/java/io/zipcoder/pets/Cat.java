package io.zipcoder.pets;

public class Cat extends Pet {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Meow";
    }
}

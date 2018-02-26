package io.zipcoder.pets;

public class Dog extends Pet {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "Woof";
    }
}

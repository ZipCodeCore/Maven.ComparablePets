package io.zipcoder.Pets;

public class Cat extends Pet {
    private String name;

    @Override
    public String speak() {
        return "Meow";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

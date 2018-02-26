package io.zipcoder.Pets;

public class Dog extends Pet {

    private String name;

    public String speak() {
        return "Woof";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

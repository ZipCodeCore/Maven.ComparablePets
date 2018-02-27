package io.zipcoder.pets;

public class Pets {

    private String name;

    public Pets() {
        this.name = "";
    }

    public Pets(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return null;
    }
}


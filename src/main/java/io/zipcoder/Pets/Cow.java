package io.zipcoder.Pets;

public class Cow extends Pet {

    private String name;

    public String speak() {
        return "Mooooooo";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

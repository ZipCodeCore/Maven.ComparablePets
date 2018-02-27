package io.zipcoder.pets;

public class Bird extends Pet {

    private String name;

    public Bird(String name) {
        super(name);
    }

    public String speak() {
        return "caw";
    }

}

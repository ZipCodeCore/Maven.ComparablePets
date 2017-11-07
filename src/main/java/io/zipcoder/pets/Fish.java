package io.zipcoder.pets;

public class Fish extends Pets {

    public Fish(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bloop bloop...";
    }

}

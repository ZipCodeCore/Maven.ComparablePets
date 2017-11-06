package io.zipcoder.pets;

public class Fish extends Pets implements Comparable<Pets>{

    public Fish(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bloop bloop...";
    }

}

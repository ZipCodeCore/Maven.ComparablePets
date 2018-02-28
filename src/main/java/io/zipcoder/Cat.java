package io.zipcoder;

public class Cat extends Pet {

    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

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
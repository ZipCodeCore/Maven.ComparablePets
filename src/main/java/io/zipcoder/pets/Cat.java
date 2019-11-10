package io.zipcoder.pets;

public class Cat extends Pets {

    public Cat(String name) {
        super(name, "cat");
    }

    public String speak() {
        return "Mow mow...";
    }
}

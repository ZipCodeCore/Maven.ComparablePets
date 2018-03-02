package io.zipcoder;

public class Cat extends Pet{

    // Super keyword is involking constructor of the parent class
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}

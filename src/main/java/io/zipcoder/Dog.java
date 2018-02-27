package io.zipcoder;

public class Dog extends Pets {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "I'm such a wimp! I'm running from a cat!";
    }

}

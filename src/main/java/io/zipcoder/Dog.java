package io.zipcoder;

public class Dog extends Pet {


    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String speak() {
        return "I'm such a wimp! I'm running from a cat!";
    }
}

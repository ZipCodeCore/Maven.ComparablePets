package io.zipcoder;

public class Dog {

    private String name;
    public Dog(){}

    public Dog(String name) {
        super();
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

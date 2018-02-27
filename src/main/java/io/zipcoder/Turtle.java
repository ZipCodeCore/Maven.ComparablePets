package io.zipcoder;

public class Turtle extends Pet implements Animal{
    private String name;
    private Turtle turtle;

    public Turtle() {
        this.name = "";
    }

    public Turtle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String speak() {
        Animal turtle = new Animal() {
            public String speak() {
                return "WEEESNAW!";
            }
        };
        return turtle.speak();
    }
}

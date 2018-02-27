package io.zipcoder;

public abstract class Pet {
    private String name;
    private Dog dog;
    private Cat cat;
    private Turtle turtle;
    private ElectricMouse electricMouse;

    public Pet(){
        this.name = "";
    }

    public Pet(String name) {
        this.name = name;
    }

    public String speak(){
        return "Meow (ever so softly)";
    }

    public String getName() {
        return name;
    }
}

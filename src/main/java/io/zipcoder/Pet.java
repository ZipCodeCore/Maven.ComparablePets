package io.zipcoder;

public abstract class Pet {
    private String name;
    private Dog dog;
    private Cat cat;
    private Turtle turtle;
    private ElectricMouse electricMouse;
    public String typeOfPet;

    public Pet(){
        this.name = "";
    }

    public Pet(String name, String typeOfPet) {
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    public String speak(){
        return "Meow (ever so softly)";
    }

    public String getName() {
        return name;
    }

}

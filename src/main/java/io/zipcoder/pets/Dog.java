package io.zipcoder.pets;

public class Dog extends Pet{

    private String name;

    public Dog(String name) {
        super(name);
    }

    public Dog(){

    }

    public String speak(){
        return "Woof!";
    }


}

package io.zipcoder.polymorphism.pets;

public class Horse extends Pet{


    public Horse(String name){
        super.setName(name);
        super.setPetType("Horse");
    }

    public Horse(){
        super.setName("No name horse");
        super.setPetType("Horse");
    }

    public String speak(){
        return "Neigh";
    }
}

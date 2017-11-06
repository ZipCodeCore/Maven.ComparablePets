package io.zipcoder;

import io.zipcoder.pets.Pets;

import java.util.ArrayList;

public class User {
    private String name;


    public User(String name) {
        this.name = name;
    }

    protected ArrayList <Pets> pets = new ArrayList <Pets>();

    public ArrayList <Pets> getPets() {
        return pets;
    }

    public void addPet(Pets newpet) {
        pets.add(newpet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String tostring(){
        return name + " has " + this.pets.size() + " pet(s).";
    }

}

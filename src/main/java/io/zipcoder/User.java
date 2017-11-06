package io.zipcoder;

import io.zipcoder.pet.Pet;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Pet> pets = new ArrayList<Pet>();

    User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public String toString(){
        String petS = " pets.";
        if(pets.size() == 1){
            petS = " pet.";
        }
        return name+" has "+pets.size()+ petS;
    }
}

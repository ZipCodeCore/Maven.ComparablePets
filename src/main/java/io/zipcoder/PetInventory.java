package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.HashMap;

public class PetInventory {

    HashMap<String, ArrayList<Pet>> pets;

    public PetInventory(){
        this.pets = new HashMap<String, ArrayList<Pet>>();

    }

    public void addPet(String petType, String petName) {

    }

    public void removePet(String petName) {

    }

    public String listPets() {
        return null;
    }

    public String getPetType(String petName) {
        return null;
    }

    public ArrayList<String> listOfPetsByName() {
        return null;
    }

    public Pet getPet(String petName) {
        return null;
    }

}

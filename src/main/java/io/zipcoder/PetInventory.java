package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PetInventory {

    protected HashMap<String,ArrayList<Pet>> pets;

    public PetInventory() {
        pets = new HashMap<String, ArrayList<Pet>>();

    }

    public void addPet(String type, String name){

    }

    public void removePet(String petName){

    }

    public String listPets(){
        return "pet names and speak";
    }

    public String getPetType(String name){
        return "pet type";
    }

    public ArrayList<String> listOfPetsByName(){
        return null;
    }

    public ArrayList<String> listOfPetsByType(){
        return null;
    }


}

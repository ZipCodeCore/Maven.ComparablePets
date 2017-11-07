package io.zipcoder;
import io.zipcoder.pet.Pet;
import java.util.ArrayList;

public class Owner {
    String name;
    ArrayList<Pet> pets = new ArrayList<Pet>();

    Owner(String name){
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    ArrayList<Pet> getPets() {
        return pets;
    }

    void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    void addPet(Pet pet){
        pets.add(pet);
    }

    @Override
    public String toString(){
        String petS = " pets.";
        if(pets.size() == 1){
            petS = " pet.";
        }
        return name+" has "+pets.size()+ petS;
    }
}

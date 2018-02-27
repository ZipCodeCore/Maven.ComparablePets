package io.zipcoder;


import io.zipcoder.io.zipcoder.pets.Cat;
import io.zipcoder.io.zipcoder.pets.Dog;
import io.zipcoder.io.zipcoder.pets.Pet;
import io.zipcoder.io.zipcoder.pets.Unicorn;

import java.util.ArrayList;
import java.util.Collections;

public class PetUtils {

    ArrayList<Pet> pets = new ArrayList<Pet>();
    private int numberOfPets;

    public ArrayList<Pet> getPets() {

        return pets;
    }

    public String printList() {

        return pets.toString();
    }


    public int getNumberOfPets() {


        return pets.size();

    }

    public void addPet(String petName, String petType) {

        Pet pet = null;
        if (petType.equalsIgnoreCase("Dog")) {
            pet = new Dog();
            pet.setPetName(petName);
            pets.add(pet);
        } else if (petType.equalsIgnoreCase("Cat")) {
            pet = new Cat();
            pet.setPetName(petName);
            pets.add(pet);
        } else if (petType.equalsIgnoreCase("Unicorn")) {
            pet = new Unicorn();
            pet.setPetName(petName);
            pets.add(pet);
        } else {
            pet = null;
        }
    }

    public boolean containsPet(String petName, String petType) {

        boolean contains = false;

        for (Pet pet : pets) {
            if (pet.getPetName().equalsIgnoreCase(petName) && pet.getClass().getSimpleName().equals(petType)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public void setNumberOfPets(int numberOfPets) {

        this.numberOfPets = numberOfPets;
    }


    public static void main(String[] args) {


    }
}


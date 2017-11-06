package io.zipcoder;

import io.zipcoder.pet.Pet;

import java.util.Comparator;

public class Checker implements Comparator<Pet> {
    @Override
    public int compare(Pet pet1, Pet pet2) {
        int className = pet1.getClass().getName().compareTo(pet2.getClass().getName());
        return className == 0 ? pet1.name.compareTo(pet2.name) : className;
    }
}

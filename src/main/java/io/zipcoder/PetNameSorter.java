package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class PetNameSorter implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

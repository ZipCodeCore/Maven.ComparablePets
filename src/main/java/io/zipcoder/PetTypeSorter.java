package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class PetTypeSorter implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString());
    }

}

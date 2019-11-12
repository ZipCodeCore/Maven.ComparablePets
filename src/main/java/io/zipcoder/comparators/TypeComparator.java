package io.zipcoder.comparators;

import io.zipcoder.pets.Pet;
import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

    
    public int compare(Pet petOne, Pet petTwo) {
        int comparePet =0;

        if (petOne != null && petTwo != null){
            comparePet = petOne.getPetType().compareTo(petTwo.getPetType());
        }

        if (comparePet == 0){
            comparePet = petOne.getName().compareTo(petTwo.getName());
        }
        return comparePet;
    }
}

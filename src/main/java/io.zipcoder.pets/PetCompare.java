package io.zipcoder.pets;

import java.util.Comparator;

public class PetCompare implements Comparator<Pet> {

    public int compare(Pet A, Pet B) {
        int nameCompare = A.getPetName().compareTo(B.getPetName());
        if(nameCompare == 0){
            return (A.getClass().getSimpleName().compareTo(B.getClass().getSimpleName()));
        }
        return nameCompare;

    }
}

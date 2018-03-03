package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class perComparator implements Comparator<Pet>{
    public int compare(Pet aPet, Pet anotherPet) {
        String aPetClass = aPet.getClass().getSimpleName();
        String antherPetClass = anotherPet.getClass().getSimpleName();
        int compare = aPetClass.compareToIgnoreCase(antherPetClass);
        if(compare==0){
            compare =(aPet.getName().compareToIgnoreCase(anotherPet.getName()));
        }


        return compare;
    }
}

package io.zipcoder.comparators;

import io.zipcoder.pets.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class PetSorter {

    Pet [] petList;

    public PetSorter(Pet [] petList){
        this.petList = petList;
    }

    public Pet [] sort(Comparator<Pet> comparator){

        Arrays.sort(petList,comparator);

        return petList;
    }

}

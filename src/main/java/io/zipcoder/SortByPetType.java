package io.zipcoder;

import io.zipcoder.Pets.Pet;

import java.util.Comparator;

public class SortByPetType implements Comparator<Pet>{

        public int compare(Pet o1, Pet o2) {
            return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        }

}

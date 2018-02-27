package io.zipcoder;

import java.util.Comparator;

public class PetCompare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        int compare = o1.getClass().getSimpleName().compareToIgnoreCase(o2.getClass().getSimpleName());
        if(compare != 0) {
            return o1.getName().compareToIgnoreCase(o1.getName());
        }
        return compare;
    }}

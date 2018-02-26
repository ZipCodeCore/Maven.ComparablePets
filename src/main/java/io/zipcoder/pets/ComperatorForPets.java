package io.zipcoder.pets;

import java.util.Comparator;

public class ComperatorForPets implements Comparator<Pet>{
    public int compare(Pet o1, Pet o2) {
        Boolean condition1 = o1.getClass().getSimpleName().equals(o2.getClass().getSimpleName());
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        int resultOfNameComaparison = o1.getName().compareTo(o2.getName());
        if (condition1) {
            return resultOfNameComaparison;
        } else {
            return result;
        }
    }
}

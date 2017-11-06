package io.zipcoder.pets;

import java.util.Comparator;

public class TypeChecker implements Comparator<Pet> {

    @Override
    public int compare(Pet a, Pet b) {

        int typeCompare = a.getClass().getSimpleName().compareTo(b.getClass().getSimpleName());

        if(typeCompare == 0){
            return (a.getName().compareTo(b.getName()));
        }
        else {
            return typeCompare;
        }
    }
}

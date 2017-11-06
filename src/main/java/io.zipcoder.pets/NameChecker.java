package io.zipcoder.pets;

import java.util.Comparator;

public class NameChecker implements Comparator<Pet> {

    @Override
    public int compare(Pet a, Pet b) {

        int nameCompare = a.getName().compareTo(b.getName());

        if(nameCompare == 0){
            return (a.getClass().getSimpleName().compareTo(b.getClass().getSimpleName()));
        }
        else {
            return nameCompare;
        }
    }
}

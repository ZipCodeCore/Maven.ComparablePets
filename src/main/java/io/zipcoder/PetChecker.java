package io.zipcoder;

import io.zipcoder.pets.Pets;

import java.util.Comparator;

public class PetChecker implements Comparator<Pets> {

    @Override
    public int compare(Pets o1, Pets o2) {

        int typecompare = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

        if(typecompare == 0){
            return o1.getName().compareTo(o2.getName());
        }

        return typecompare;
    }
}

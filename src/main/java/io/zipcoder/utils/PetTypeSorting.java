package io.zipcoder.utils;

import io.zipcoder.pets.Pets;

import java.util.Comparator;

public class PetTypeSorting implements Comparator<Pets> {

    public int compare(Pets p1, Pets p2) {
        return p1.getType().compareTo(p2.getType());
    }
}

package io.zipcoder.utils;

import io.zipcoder.pets.Pets;

import java.util.Comparator;

public class PetNameSorting implements Comparator<Pets> {
    public int compare(Pets p1, Pets p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

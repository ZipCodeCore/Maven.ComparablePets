package io.zipcoder;

import java.util.Comparator;

public class ComparePets implements Comparator<Pet> {
    public int compare(Pet p1, Pet p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

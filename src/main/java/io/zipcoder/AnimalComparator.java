package io.zipcoder;

import java.util.Collections;
import java.util.Comparator;

public class AnimalComparator implements Comparator<Pet>{

    public int compare(Pet o1, Pet o2) {
        return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

    }

}

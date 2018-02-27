package io.zipcoder;

import java.util.Comparator;

public class CompareAnimal implements Comparator<Pet>{

        //compare by type
    public int compare(Pet o1, Pet o2) {
        return o1.getClass().getSimpleName().compareToIgnoreCase(o2.getClass().getSimpleName());
    }

}

package io.zipcoder.io.zipcoder.pets;

import java.util.Comparator;

public class Compare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {

        int comparable = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

        if(comparable == 0) {
            return 0;
        }else if(comparable > 0) {
            return 1;
        }else {
            return -1;
        }
    }
}

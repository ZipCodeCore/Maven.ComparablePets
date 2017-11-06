package io.zipcoder.pets;

import java.util.Comparator;

public class CompareType implements Comparator<Pets> {

    public int compare(Pets o1, Pets o2) {
        if (o1.getClass().getName().compareTo(o2.getClass().getName()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }

        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}

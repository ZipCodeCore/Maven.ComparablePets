package io.zipcoder.pets;

import java.util.Comparator;

public class TypeCompare implements Comparator<Pets>{
    public int compare(Pets o1, Pets o2) {
        if (o1.getClass().getName().compareTo(o2.getClass().getName())==0)
            return o1.name.compareTo(o2.name);
        else return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}

package io.zipcoder.pets;

import java.util.Comparator;

public class TypeCompare implements Comparator<Pets>{
    public int compare(Pets o1, Pets o2) {
        String o1ClassName=o1.getClass().getName();
        String o2ClassName=o2.getClass().getName();

        if (o1ClassName.compareTo(o2ClassName)==0)
            return o1.getName().compareTo(o2.getName());
        else return o1ClassName.compareTo(o2ClassName);
    }
}

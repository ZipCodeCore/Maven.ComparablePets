package io.zipcoder;


import java.util.Comparator;


public class ComparePets implements Comparator {

    public int compare(Object o1, Object o2) {
        Pet p1 = (Pet)o1;
        Pet p2 = (Pet)o2;
        return p1.getName().compareTo(p2.getName());
    }
}

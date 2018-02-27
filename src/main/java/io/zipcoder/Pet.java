package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {

    private String name;

    public Pet(String name) {
        this.name = name;
    }
    public String speak(){
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet o) {
        int compare = this.getName().compareToIgnoreCase(o.getName());

        if (compare != 0) {
            return compare;
        } else {
            compare = this.getClass().getSimpleName().compareToIgnoreCase(o.getClass().getSimpleName());

            return compare;
        }
    }

    public int compare(Pet o1, Pet o2) {
        int compare = o1.getClass().getSimpleName().compareToIgnoreCase(o2.getClass().getSimpleName());

        if (compare != 0) {
            return compare;
        } else {
            compare = o1.getName().compareToIgnoreCase(o2.getName());
            return compare;
        }
    }
}


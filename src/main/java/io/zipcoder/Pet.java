package io.zipcoder;

import java.util.Comparator;

public  class Pet implements Comparable<Pet>, Comparator<Pet>{

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "";
    }

    public int compareTo(Pet o) {
        return 0;
    }

    public int compare(Pet o1, Pet o2) {
        return 0;
    }
}

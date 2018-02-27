package io.zipcoder;


import java.util.Comparator;

public abstract class Pet implements Comparable<Pet> {

    private String petName;

    public abstract String speak();

    public String getName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public int compareTo(Pet o) {
        int compare = this.getName().compareTo(o.getName());
        int compareClass = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        if (compare == 0) {
            return compareClass;
        }

        return compare;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

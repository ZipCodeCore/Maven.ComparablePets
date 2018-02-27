package io.zipcoder;

import java.util.Comparator;

public abstract class Pets implements Comparable<Pets> , Comparator<Pets>{

    protected String name;

    protected Pets(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public abstract String speak();

    public int compareTo(Pets pet) {

        int compare = this.getName().compareToIgnoreCase(pet.getName());

        if(compare != 0) {
            return compare;
        } else {

            compare = this.getClass().getSimpleName().compareToIgnoreCase(pet.getClass().getSimpleName());

            return compare;
        }

    }
    public int compare(Pets pet1, Pets pet2) {
        int compare = pet1.getClass().getSimpleName().compareToIgnoreCase((pet2.getClass().getSimpleName()));

        if(compare != 0) {
            return compare;
        } else {
            compare = pet1.getName().compareToIgnoreCase(pet2.getName());
            return compare;
        }

    }
}



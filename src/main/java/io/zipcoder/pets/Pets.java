package io.zipcoder.pets;


import java.util.Comparator;

public abstract class Pets implements Comparable<Pets>{

    public abstract String speak();

    private String name;

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int compareTo(Pets other) {
        String thisClassName=getClass().getName();
        String otherClassName= other.getClass().getName();
        if (name.compareTo(other.name) == 0)
            return thisClassName.compareTo(otherClassName);
        else return this.name.compareTo(other.name);
    }

}

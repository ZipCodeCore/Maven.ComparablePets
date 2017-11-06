package io.zipcoder.pets;


import java.util.Comparator;

public abstract class Pets implements Comparable{

    public abstract String speak();

    String name;

    public Pets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int compareTo(Object o) {
        Pets other=(Pets)o;
        if (this.name.compareTo(other.name) == 0)
            return this.getClass().getName().compareTo(other.getClass().getName());
        else return this.name.compareTo(other.name);
    }

}

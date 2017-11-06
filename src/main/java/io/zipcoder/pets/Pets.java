package io.zipcoder.pets;


import java.util.Comparator;

public abstract class Pets implements Comparable<Pets>, Comparator{

    public abstract String speak();

    String name;

    public Pets(String name) {
        this.name = name;
    }

    public String getNames() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int compareTo(Pets other) {
        if (this.name.compareTo(other.name) == 0)
            return this.getClass().getName().compareTo(other.getClass().getName());
        else return this.name.compareTo(other.name);
    }

    public int compare(Object objectA, Object objectB){
        Pets petA=(Pets)objectA;
        Pets petB=(Pets)objectB;

        if (petA.name.length()==petB.name.length());
        return petA.getClass().toString().compareTo(petB.getClass().toString());
    }

}

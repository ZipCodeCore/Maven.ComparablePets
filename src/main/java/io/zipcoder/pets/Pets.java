package io.zipcoder.pets;

public abstract class Pets implements Comparable<Pets> {

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

    public int compareTo(Pets other) {
        if (this.name.compareTo(other.name) == 0) {
           return this.getClass().getName().compareTo(other.getClass().getName());
        }

        return this.name.compareTo(other.name);
    }
}


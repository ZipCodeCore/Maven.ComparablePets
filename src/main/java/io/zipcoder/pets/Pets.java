package io.zipcoder.pets;

import java.util.Comparator;

public class Pets implements Comparable<Pets>, Comparator<Pets> {

    private String name;

    public Pets() {
        this.name = "";
    }

    public Pets(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String speak() {
        return null;
    }

    @Override
    public int compareTo(Pets o) {
        int comp = 0;
        if (this.getName().equalsIgnoreCase(o.getName())) {
            comp = this.toString().compareTo(o.toString());
        } else {
            comp = this.getName().compareTo(o.getName());
        }
        return comp;
    }


    @Override
    public int compare(Pets o1, Pets o2) {
       return 0;
    }
}


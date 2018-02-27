package io.zipcoder;

import java.util.Comparator;

public abstract class Pets implements Comparable<Pets>, Comparator<Pets>{

    public String name;


    public Pets(String name) {
        this.name = name;

    }






    public abstract String speak();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

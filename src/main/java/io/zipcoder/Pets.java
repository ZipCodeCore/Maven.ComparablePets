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
}

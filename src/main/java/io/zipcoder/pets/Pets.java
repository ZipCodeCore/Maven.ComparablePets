package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pets{

    private String name;
    private String type;

    public Pets() {
        this.name = "";
    }

    public Pets(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String speak();



}


package io.zipcoder.pets;

import java.util.Comparator;

public class Pets{

    private String name;
    private String type;

    public Pets() {
        this.name = "";
        this.type= "";
    }

    public Pets(String name) {
        this.name = name;
        this.type = "";

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

    public String speak() {
        return null;
    }



}


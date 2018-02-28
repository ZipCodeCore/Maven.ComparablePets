package io.zipcoder;

import java.lang.Comparable;

public abstract class Pet {

    protected String name;

    //Constructors
    protected Pet(){}

    protected Pet(String name)
    {
        this.name = name;
    }


    public void setName(String name) {

    }

    public String getName() {

        return this.name;
    }

    public abstract String speak();
}

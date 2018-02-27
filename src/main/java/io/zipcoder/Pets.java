package io.zipcoder;

public abstract class Pets{

    protected String name;

    //Constructors
    protected Pets(){}

    protected Pets(String name)
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

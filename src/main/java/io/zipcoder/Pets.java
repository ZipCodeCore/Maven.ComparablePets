package io.zipcoder;

public abstract class Pets {

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

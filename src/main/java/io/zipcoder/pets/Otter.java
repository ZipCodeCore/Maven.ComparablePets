package io.zipcoder.pets;

public class Otter extends Pet {
    private String name;

    public Otter(String otterName) {
        this.name = otterName;
    }

    public String speak(){
        return "Muahaha";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String anOtterName) {
        this.name = anOtterName;

    }

}

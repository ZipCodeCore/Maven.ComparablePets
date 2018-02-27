package io.zipcoder.pets;

public class Otter extends Pet {

    private String otterName;

    public Otter(String otterName) {
        this.otterName = otterName;
    }


    public String speak() {

        return "Muahaha";
    }

    public void setName(String anOtterName) {
        this.otterName=anOtterName;
    }

    public String getName() {

        return this.otterName;
    }

}

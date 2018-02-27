package io.zipcoder.pets;

public class Otter extends Pet {

    private String otterName;

    public Otter(String otterName) {
        this.otterName = otterName;
    }


    public String speak() {

        return "Hello";
    }

    public void setOtterName(String anOtterName) {
        this.otterName=anOtterName;
    }

    public String getOtterName() {

        return this.otterName;
    }

}

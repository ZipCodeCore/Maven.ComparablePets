package io.zipcoder;

public abstract class Pets {

    public String name;


    public Pets() {

    }






    public String speak() {
        return "I am a pet!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

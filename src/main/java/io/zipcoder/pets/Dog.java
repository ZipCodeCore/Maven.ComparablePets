package io.zipcoder.pets;

public class Dog extends Pet {
    private String name;

    public Dog(String dogName) {
        this.name = dogName;
    }

    public String speak(){
        return "Woof";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aDogName) {
        this.name = aDogName;
    }

}

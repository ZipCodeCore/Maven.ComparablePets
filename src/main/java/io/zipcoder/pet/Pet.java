package io.zipcoder.pet;

public abstract class Pet{
    public String name;

//    public Pet (String name){
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

    public abstract String toString();
}

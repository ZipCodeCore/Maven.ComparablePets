package io.zipcoder;

public class Dog extends Pet {

    public Dog(){

    }

    public Dog(String name) {
        super(name);
    }

    public String speak(){
        return "Bark";
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

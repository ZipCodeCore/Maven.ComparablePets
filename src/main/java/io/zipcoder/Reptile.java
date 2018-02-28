package io.zipcoder;

public class Reptile extends Pet {

    public Reptile(){

    }

    public Reptile(String name) {
        super(name);
    }

    public String speak(){
        return "Sssss";
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}


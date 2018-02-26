package io.zipcoder.pets;


abstract public class Pet {

    protected String name;

    public void setName (String name){

        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String speak(){
        return null;
    }

}

package io.zipcoder.pets;

public abstract class Pets {

    public Pets(){

    }

    protected String name;

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "";
    }


    public abstract String tostring();



}

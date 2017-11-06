package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pets implements Comparable<Pets>{

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


    public int compareTo(Pets pet){
        int name =this.name.compareTo(pet.name);
        return name == 0 ? this.getClass().getName().compareTo(pet.getClass().getName()) : name;
    }

}

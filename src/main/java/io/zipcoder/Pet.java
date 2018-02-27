package io.zipcoder;

import java.util.ArrayList;

public class Pet implements Comparable<Pet>{

    private String name;

    public Pet(){
    }
    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "noise!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }



    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }

}

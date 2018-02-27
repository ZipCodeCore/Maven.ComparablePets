package io.zipcoder.io.zipcoder.pets;

import io.zipcoder.PetUtils;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public abstract class Pet implements Comparable<Pet> {

    private String petName;

    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString(){

        return "[" + petName + ", " + this.getClass().getSimpleName()+ "]";

    }
    public int compareTo(Pet o) {

        int result = this.getPetName().compareTo(o.getPetName());
        int classCompare = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());

        if(result == 0) {
            return classCompare;
        }else {
            return result;
        }
    }


}

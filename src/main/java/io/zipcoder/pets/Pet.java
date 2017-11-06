package io.zipcoder.pets;

import java.util.Comparator;


public abstract class Pet implements Comparable<Pet> {

    private String name;

    public Pet(String name) {
        this.name = name;
    }


//    @Override
//    public int compareTo(Pet pet) {
//        int returnValue = 0;
//        if(this.getClass().equals(pet.getClass()) ) {
//            returnValue = this.getName().compareToIgnoreCase(pet.getName());
//        }
//        return returnValue;
//    }

    @Override
    public int compareTo(Pet pet) {
        int returnValue = 0;
        if(!this.getName().equalsIgnoreCase(pet.getName()) ) {
            returnValue = this.getClass().getName().compareTo(pet.getClass().getName());
        }
        return returnValue;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public void speak() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

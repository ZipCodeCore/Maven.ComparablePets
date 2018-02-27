package io.zipcoder.Pets;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Pet{

    public String name;
    public Integer age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Pet(){
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String speak();

    public int compareTo(Pet other) {
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than
        // other and 0 if they are supposed to be equal
        int petType = this.getClass().getSimpleName().compareTo(other.getClass().getSimpleName());
        return petType == 0 ? this.getName().compareTo(other.getName()) : petType;
    }

    public Comparator<Pet> petComparator = (pet1, pet2) -> pet1.getClass().getSimpleName() - pet2.getClass().getSimpleName();

        @Override
        Arrays.sort(pet, ){

    }

}

package io.zipcoder.pets;

abstract public class Pet implements PetBehavior,Comparable<Pet>{

    private String name;

    public String speak() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setName(String aPetName) {

    }
    public int compareTo(Pet anotherPet){
        if (getName().compareTo(anotherPet.getName()) > 0) {
            return 1;
        } else if (getName().compareTo(anotherPet.getName()) < 0) {
            return -1;
        } else {
            return getClass().getSimpleName().compareTo(anotherPet.getClass().getSimpleName());
        }
    }

}

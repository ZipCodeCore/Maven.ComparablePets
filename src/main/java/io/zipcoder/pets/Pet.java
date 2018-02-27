package io.zipcoder.pets;

abstract public class Pet implements PetBehavior, Comparable<Pet>{

    private String name;


    public String speak() {
        return null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aPetName) {

    }

    @Override
    public int compareTo(Pet anotherPet){

//        if(this.getName().compareTo(anotherPet.getName()) == 0) {
//            return this.getClass().getSimpleName().compareTo(anotherPet.getClass().getSimpleName());
//        } else {
//            return this.getName().compareTo(anotherPet.getName());
//        }


        if (getName().compareTo(anotherPet.getName()) > 0) {
            return 1;
        } else if (getName().compareTo(anotherPet.getName()) < 0) {
            return -1;
        } else {
            return getClass().getSimpleName().compareTo(getClass().getSimpleName());
        }


    }


}

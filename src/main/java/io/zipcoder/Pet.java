package io.zipcoder;


public abstract class Pet implements Comparable<Pet>{

    private String speech;
    private String name;

    public Pet( String name){
        this.name = name;
    }

    public Pet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();


    @Override
    public String toString() {
        return "This pet is a " + getClass().getSimpleName() + " named " + name + ", who goes " + name;

    }

    public int compareTo(Pet pet) {
        if(this.name.compareTo(pet.getName()) == -1){
            return -1;
        }else if(this.name.compareTo(pet.getName()) == 0){
            return 0;
        } else if(this.name.compareTo(pet.getName()) == 1){
            return 1;
        }
        return 0;
    }


}

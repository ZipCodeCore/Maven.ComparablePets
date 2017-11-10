package io.zipcoder;

public abstract class Pet implements Comparable<Pet> {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract String speak();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pet pet) {
        //Sort pet objects by type, breaking ties by name.
        if (this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName()) == 0) {
            return this.getName().compareTo(pet.getName());
        } else {
            return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
        }

        // Sort by name, breaking ties by class type.
//        if (this.getName().compareTo(pet.getName()) == 0) {
//            return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
//        } else {
//            return this.getName().compareTo(pet.getName());
//        }
    }
}

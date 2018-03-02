package io.zipcoder.pets;

abstract public class Pet implements PetBehavior, Comparable<Pet> {

    private String name;

    public Pet(String aName) {
        this.name = aName;
    }

    public String speak() {
        return null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    @Override
    public int compareTo(Pet anotherPet) {
        String otherPetName = anotherPet.getName();
        int result = -(otherPetName.compareTo(name));
        boolean sameName = (result == 0);
        if (sameName) {
            Class otherPetClass = anotherPet.getClass();
            String otherPetClassName = otherPetClass.getSimpleName();

            Class thisPetClass = this.getClass();
            String thisPetClassName = thisPetClass.getSimpleName();

            result = -(otherPetClassName.compareTo(thisPetClassName));
        }
        return result;
    }





}

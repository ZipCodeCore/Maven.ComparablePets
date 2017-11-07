package io.zipcoder.pet;

public abstract class Pet implements Comparable<Pet>{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String speak();

    public abstract String toString();

    @Override
    public int compareTo(Pet comparePet){
        String petName = comparePet.name;
        String petClassName = comparePet.getClass().getName();
        String className = getClass().getName();

        int nameInt = name.compareTo(petName);
        return nameInt == 0 ? className.compareTo(petClassName): nameInt;
    }

}

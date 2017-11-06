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
        int nameInt = name.compareTo(comparePet.name);
        return nameInt == 0 ? getClass().getName()
                .compareTo(comparePet.getClass().getName()): nameInt;
    }

}

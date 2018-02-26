package io.zipcoder;

import java.util.Collections;

public abstract class Pet implements Comparable<Pet> {
    String name;

    public Pet(String name) {
        this.setName(name);
    }

    public abstract String speak();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getSimpleName() + ": " + this.getName());
        return builder.toString();
    }

    public int compareTo(Pet pet1) {
        int compareName = this.getName().compareTo(pet1.getName());
        if (compareName == 0) {
            return this.getClass().getSimpleName().compareTo(pet1.getClass().getSimpleName());
        }
        return compareName;
    }
}

package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */

public abstract class Pet<T> implements Comparable<T> {
    private static final String fDEFAULT_PET_NAME = "Gerald";
    private String name;

    Pet() {
        this(fDEFAULT_PET_NAME);
    }

    Pet(String name) {
        this.name = name;
    }

    abstract String speak();

    @Override
    public int compareTo(T o) {
        return -1;
    }

    @Override
    public String toString() {
        return null;
    }
}

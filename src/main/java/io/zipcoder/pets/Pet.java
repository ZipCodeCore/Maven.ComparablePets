package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */

public abstract class Pet<T extends Pet<T>> implements Comparable<T> {
    private String name;

    Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String speak();

    private int comparePetByName(T o) {
        return name.compareTo(o.getName());
    }

    @Override
    public int compareTo(T o) {
        String t1 = this.getClass().getSimpleName();
        String t2 = o.getClass().getSimpleName();

        int r = t1.compareTo(t2);
        return (r == 0) ? comparePetByName(o) : r;
    }

    @Override
    public String toString() {
       return String.format("%s the %s says: \"%s\"",
               getName(),
               this.getClass().getSimpleName(),
               this.speak());
    }
}

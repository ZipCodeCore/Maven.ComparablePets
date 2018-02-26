package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class Dog extends Pet<Dog> {
    private static final String fDEFAULT_NAME = "Clarence";

    Dog() {
        this(fDEFAULT_NAME);
    }

    Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        //
    }
}

package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class Cat extends Pet<Cat> {
    private static final String fDEFAULT_NAME = "Milo";

    Cat() {
        this(fDEFAULT_NAME);
    }

    Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return null;
    }
}

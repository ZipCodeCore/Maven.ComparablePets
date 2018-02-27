package io.zipcoder.pets;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class KomodoDragon extends Pet<KomodoDragon> {
    private static final String fDEFAULT_NAME = "Phillip";
    private static final String fSOUND = "hiss";

    public KomodoDragon() {
        this(fDEFAULT_NAME);
    }

    public KomodoDragon(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return fSOUND;
    }
}

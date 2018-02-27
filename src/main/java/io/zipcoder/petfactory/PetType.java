package io.zipcoder.petfactory;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public enum PetType {
    DOG("dog"),
    CAT("cat"),
    KOMODODRAGON("komodo dragon");

    String text;

    PetType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static PetType valFromString(String text) {
        for (PetType p : PetType.values()) {
            if (p.text.equalsIgnoreCase(text))
                return p;
        }
        return null;
    }
}

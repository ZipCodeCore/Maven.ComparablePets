package io.zipcoder;

public class PetFactory {
    public static Pet petCreator(String type, String name) {

        if("Dog".equalsIgnoreCase(type)) {
            return new Dog(name);

        } else if ("Cat".equalsIgnoreCase(type)){
            return new Cat(name);

        } else if ("Snake".equalsIgnoreCase(type)) {
            return new Snake(name);

        } return null;

    }
}

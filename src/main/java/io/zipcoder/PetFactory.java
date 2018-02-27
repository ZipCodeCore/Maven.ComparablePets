package io.zipcoder;

public class PetFactory {

    public static Pets createPet(String type, String name) {

        if (type.equalsIgnoreCase("Dog"))
            return new Dog(name);
        else if (type.equalsIgnoreCase("Cat"))
            return new Cat(name);
        else if (type.equalsIgnoreCase("Snake"))
            return new Snake(name);

        return null;
    }
}


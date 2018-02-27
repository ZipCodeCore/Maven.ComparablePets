package io.zipcoder;

public class PetFactory {

    public static Pets petCreator(String type, String name) {
        if(type.equals("Cat"))
            return new Cat(name);
        else if (type.equals("Snake"))
            return new Snake(name);
        else if (type.equals("Dog"))
            return new Dog(name);
        return null;
    }
}

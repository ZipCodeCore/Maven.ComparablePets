package io.zipcoder.pets;

public class PetFactory {

    public static Pets createPets(String pet, String name) {
        if(pet.equalsIgnoreCase("dog")) {
            return new Dog(name);
        } else if (pet.equalsIgnoreCase("cat")) {
            return new Cat(name);
        } else if (pet.equalsIgnoreCase("parrot")) {
            return new Parrot(name);
        }
        return null;
    }

}

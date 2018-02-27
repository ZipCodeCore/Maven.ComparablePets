package io.zipcoder.pets;

public class PetFactory {

    public static Pet createPet(String input, String name){

        if(input.equalsIgnoreCase("Dog")){
            return new Dog(name);
        } else if(input.equalsIgnoreCase("Cat")){
            return new Cat(name);
        } else if(input.equalsIgnoreCase("Kangaroo")) {
            return new Kangaroo(name);
        }

        return null;

    }

}

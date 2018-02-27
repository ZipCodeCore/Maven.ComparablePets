package io.zipcoder.pets;

public class PetFactory {

    public static Pet createPet(String input, String name){
        if(input.equalsIgnoreCase("dog")){
            return new Dog(name);
        }

        else if(input.equalsIgnoreCase("cat")){
            return new Cat(name);
        }

        else if(input.equalsIgnoreCase("kangaroo")){
            return new Kangaroo(name);
        }
        return null;
    }

}

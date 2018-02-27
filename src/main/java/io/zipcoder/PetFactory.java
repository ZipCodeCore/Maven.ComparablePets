package io.zipcoder;

public class PetFactory {

    public static Pet createPet(String name, String type){
        if (type.equalsIgnoreCase("dog")){
            return new Dog(name);
        }
        else if (type.equalsIgnoreCase("Cat")){
            return new Cat(name);
        }
        else if (type.equalsIgnoreCase("Bird")) {
            return new Bird(name);
        }else {
                System.out.println("error");
            }
            return null;
    }
}

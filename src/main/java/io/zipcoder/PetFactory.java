package io.zipcoder;

public class PetFactory {
    public static Pet createPet(String type, String name){
        if (type.equalsIgnoreCase("Dog")){
            return new Dog(name);
        } else  if (type.equalsIgnoreCase("Cat")){
            return new Cat(name);
        }else if (type.equalsIgnoreCase("Bird")){
            return new Bird(name);
        }else {
            System.out.println("Not a pet type available!");
        }
        return null;
    }
}

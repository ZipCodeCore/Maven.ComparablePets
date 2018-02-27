package io.zipcoder;


import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {

//        Console.print("Hello dear user. How many pets do you have?");
//        int usersNumOfPets = Console.getInt();
//        Console.print("Thanks! What kind of pets do you have? Please specify using only the following:");
//        String petOptions = Arrays.toString(PetTypes.values());
//        Console.print(petOptions);
//        String usersKindsOfPets = Console.getString();
//        PetTypes type = PetTypes.valueOf(usersKindsOfPets);
//        Console.print("Thanks. You entered that you have " + usersNumOfPets + " pet(s) and that they are " +
//        type);


        ArrayList<Pet> pets = new ArrayList<Pet>();

        Capybara vince = new Capybara("Vince", 2);
        Capybara jaxson = new Capybara("Jaxon", 2);
        Capybara addison = new Capybara("Addison", 2);
        Capybara amy = new Capybara("Amy", 14);
        Cat frederick = new Cat("Frederick", 3);
        Cat george = new Cat("George", 3);
        Cat biscuit = new Cat("Biscuit", 3);
        Dog cassie = new Dog("Cassie", 12);
        Dog henry = new Dog("Henry", 12);


        pets.add(vince);
        pets.add(jaxson);
        pets.add(addison);
        pets.add(amy);
        pets.add(frederick);
        pets.add(biscuit);
        pets.add(cassie);
        pets.add(henry);



        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }

        Collections.sort(pets);

        for (Pet pet : pets) {
            System.out.println(pet.getName());
        }


    }


}

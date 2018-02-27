package io.zipcoder;


import io.zipcoder.Pets.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Console.print("Hello dear user. How many pets do you have?");
        int usersNumOfPets = Console.getInt();
        Console.print("Thanks! What kind of pets do you have? Please specify using only the following:");
        ArrayList<Pet> petArrayList = new ArrayList<>();
        for (int i = 0; i < usersNumOfPets; i++) {
            Console.print(Arrays.toString(PetTypes.values()));
            String usersKindOfPets = Console.getString();
            Console.print("What's their name?");
            String name = Console.getString();
            Console.print("How old is this pet?");
            int age = Console.getInt();
            Pet tempPet;
            switch (usersKindOfPets.toLowerCase()) {
                case "cat":
                    tempPet = new Cat(name, age);
                    petArrayList.add(tempPet);
                    break;
                case "dog":
                    tempPet = new Dog(name, age);
                    petArrayList.add(tempPet);
                    break;
                case "capybara":
                    tempPet = new Capybara(name, age);
                    petArrayList.add(tempPet);
                    break;
            }
        }
    }
}



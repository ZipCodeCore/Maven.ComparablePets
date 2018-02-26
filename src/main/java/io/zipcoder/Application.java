package io.zipcoder;


import io.zipcoder.io.zipcoder.pets.Console;
import io.zipcoder.io.zipcoder.pets.PetTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Console.print("Hello dear user. How many pets do you have?");
        int usersNumOfPets = Console.getInt();
        Console.print("Thanks! What kind of pets do you have? Please specify using only the following:");
        String petOptions = Arrays.toString(PetTypes.values());
        Console.print(petOptions);
        String usersKindsOfPets = Console.getString();
        PetTypes type = PetTypes.valueOf(usersKindsOfPets);
        Console.print("Thanks. You entered that you have " + usersNumOfPets + " pet(s) and that they are " +
        type);

    }



}

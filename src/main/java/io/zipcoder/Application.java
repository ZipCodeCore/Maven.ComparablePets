package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static io.zipcoder.Console.getStringInput;

public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfPets = Console.getIntegerInput("How many pets do you own?:");
        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < numberOfPets; i++) {
            String petName = Console.getStringInput("What is the name of 'pet number %s'", i);
            String petType = Console.getStringInput("What kind of pet is '%s'", petName);
            Pet pet = null;
            switch (petType) {
                case "dog":
                    pet = new Dog(petName);
                    break;
                case "cat":
                    pet = new Cat(petName);
                    break;
                default:
                    Console.println("My application does not support %s type of pets.", petType);

            }
            petList.add(pet);
        }

        Object[] listAsArray = petList.toArray();
        String listAsString = Arrays.toString(listAsArray);

        Console.println("Here are all the pets:");
        Console.println(listAsString);
    }
}

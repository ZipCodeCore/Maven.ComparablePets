package io.zipcoder;


import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static List<Pet> pets;

    public static void main(String[] args) {
        int numberOfPets = askNumberOfPets();
        pets = new ArrayList<>(numberOfPets);
        askPetInfo();
        printPetInfo();
    }

    public static int askNumberOfPets() {
        System.out.println("How many pets do you have?");
        Scanner in = new Scanner(System.in);
        for(;;) {
            String input = in.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter your answer as an integer...");
            }
        }
    }

    public static void askPetInfo() {

    }

    public static void printPetInfo() {

    }
}

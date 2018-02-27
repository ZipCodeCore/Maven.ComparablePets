package io.zipcoder;


import io.zipcoder.petfactory.*;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static PetFactory petFactory = new PetFactoryImpl();
    private static int numberOfPets;

    public static void main(String[] args) {
        List<Pet> pets = setupPetsList();
        pets = askPetInfo(pets);
        printPetInfo(pets);
    }

    private static ArrayList<Pet> setupPetsList() {
        numberOfPets = askNumberOfPets();
        return new ArrayList<>(numberOfPets);
    }

    private static int askNumberOfPets() {
        System.out.println("How many pets do you have?");
        return ensureInputAsInt();
    }

    private static List<Pet> askPetInfo(List<Pet> pets) {
        Scanner in = new Scanner(System.in);
        for (int i=0;i<numberOfPets;i++) {
            boolean petCreated = false;
            do {
                PetInfo p = getNewPetInfo(in);
                Pet pet = tryMakePet(p);
                if (pet != null) {
                    pets.add(pet);
                    petCreated = true;
                }
            }while(!petCreated);
        }
        return pets;
    }

    private static Pet tryMakePet(PetInfo p) {
        try {
            return petFactory.makePet(p);
        } catch (InvalidPetTypeException e) {
            return null;
        }
    }

    private static PetInfo getNewPetInfo(Scanner in) {
        System.out.println("What kind of pet? " + getPetTypesString() + "? (not case sensitive, mispell and crash deal with it, chump)");
        String type = in.nextLine();
        System.out.print("Name the beastie: ");
        String name = in.nextLine();

       return new PetInfo(name, PetType.valFromString(type));
    }

    private static String getPetTypesString() {
        return Arrays.toString(PetType.values());
    }

    private static void printPetInfo(List<Pet> pets) {
        for (Pet p : pets) {
            System.out.println(p.toString());
        }
    }

    private static int ensureInputAsInt() {
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            String input = in.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter your answer as an integer...");
            }
        }
    }
}

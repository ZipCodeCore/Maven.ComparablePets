package io.zipcoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class Application {
    public static void main (String[] args) {

        ArrayList<Pet> pets = new ArrayList<>();
        int numberOfPets;
        String petType;
        String petName;

        numberOfPets = Integer.parseInt(getUserInput("How many pets you got?"));



        System.out.println("\nWow! I wish I had " + numberOfPets + " pet(s)!\n");

        for (int i = 0; i < numberOfPets; i++) {
            petType = getPetType();
            Class<?> clazz = validateClassName(petType);
            petName = getUserInput("What is the name of this pet?");
            Pet pet = createPet(clazz, petName);
            pets.add(pet);
        }

        for (int i = 0; i < pets.size(); i++) {
            System.out.println("The name of the pet is: " + pets.get(i).getName());
            System.out.println("The pet goes: " + pets.get(i).speak());
        }
    }

    private static Pet createPet(Class<?> clazz, String name) {
        Pet pet = null;
        try {
            Constructor<?>[] constructors = clazz.getConstructors();
            Object object = constructors[0].newInstance(name);
            pet = (Pet) object;
        }
        catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return pet;
    }

    private static String getPetType() {
        String packageName = "io.zipcoder.polymorphism.";
        String petType = getUserInput("What type of pet do you have? (Dog, Cat, or Goat)?");
        petType = petType.trim();
        petType = petType.substring(0, 1).toUpperCase() + petType.substring(1).toLowerCase();
        return packageName + petType;
    }

    private static Class<?> validateClassName(String petName) {
        Class<?> clazz;
        try {
            clazz = Class.forName(petName);
            if (clazz.getSimpleName().equals("Pet")) {
                Exception e = new Exception();
                throw e;
            }
        } catch (Exception e) {
            System.out.println("Invalid class name. Please re-enter.");
            petName = getPetType();
            clazz = validateClassName(petName);
        }
        return clazz;
    }

    private static String getUserInput (String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

}

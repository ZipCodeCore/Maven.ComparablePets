package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application {

    private static ArrayList<Pet> petArrayList = new ArrayList<Pet>();
    private static Scanner input = new Scanner(System.in);

    public Application () {
        // Null constructor
    }

    public ArrayList<Pet> getPetArrayList() {
        return petArrayList;
    }

    public static void addPetToArrayList(Pet petToAdd) {
        petArrayList.add(petToAdd);
    }

    public static String printListOfAllPets() {
        StringBuilder stringBuilder = new StringBuilder();
        String prefix = "";
        for (int i = 0; i < petArrayList.size(); i++) {
            stringBuilder.append(prefix);
            stringBuilder.append(petArrayList.get(i).getName());
            stringBuilder.append(" says " + petArrayList.get(i).speak());
            prefix = "\n";
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Pet Storage Inc.\nHow many pets do you have?");
        int amountOfPets = Integer.parseInt(input.nextLine());
        System.out.println("Enter your pet's name and the type of pet separated by a space:");
        for (int i = 0; i < amountOfPets; i++) {
            String scannerInput = scannerReader();
            typeOfPetStringTranslator(scannerInput);
        }
        System.out.println(printListOfAllPets());
        nameSort(petArrayList);
        typeSort(petArrayList);
    }

    public static void typeOfPetStringTranslator(String petNameAndTypeAsString) {
        String[] petNameAndTypeAsArray = petNameAndTypeAsString.split(" ");
        String nameOfPet = petNameAndTypeAsArray[0];
        String typeOfPet = petNameAndTypeAsArray[1].toLowerCase();
        if (typeOfPet.equals("dog")) {
            addPetToArrayList(new Dog(nameOfPet));
        } else if (typeOfPet.equals("cat")) {
            addPetToArrayList(new Cat(nameOfPet));
        } else if (typeOfPet.equals("bird")) {
            addPetToArrayList(new Bird(nameOfPet));
        }
    }

    public static String scannerReader() {
        String tempStringHolder = "";
        tempStringHolder += input.nextLine();
        return tempStringHolder;
    }

    public static void nameSort(ArrayList petList) {
        Collections.sort(petList, new PetNameSorter());
        System.out.println("All pets organized by name:");
        for (Object pet : petList) {
            System.out.println((Pet)pet + "\n");
        }
    }

    public static void typeSort(ArrayList petList) {
        Collections.sort(petList, new PetTypeSorter());
        System.out.println("All pets organized by type:");
        for (Object pet : petList) {
            System.out.println(pet.toString() + "\n");
        }
    }

}

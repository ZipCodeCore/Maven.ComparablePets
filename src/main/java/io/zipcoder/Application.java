package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
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

    public String printListOfAllPets() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Pet Storage Inc.\nHow many pets do you have?");
        int amountOfPets = input.nextInt();
        System.out.println("Enter your pet's name and the type of pet separated by a space:");
        for (int i = 0; i < amountOfPets; i++) {
            String petNameAndTypeAsString = input.nextLine();
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
        // TODO:
        // 1. Ask user how many pets, store that number and use it to determine how many times for loop runs
        // 2. Ask user for type of pet and name, separated by comma and petArrayList.add(pet)
        // 3. Need method for formatting and detecting invalid input
    }

}

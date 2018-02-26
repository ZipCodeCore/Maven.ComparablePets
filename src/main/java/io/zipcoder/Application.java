package io.zipcoder;

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

    public String printListofAllPets() {
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Pet Storage Inc.");
        String petName = input.nextLine();
        // TODO:
        // 1. Ask user how many pets, store that number and use it to determine how many times for loop runs
        // 2. Ask user for type of pet and name, separated by comma and petArrayList.add(pet)
        // 3. Need method for formatting and detecting invalid input
    }

}

package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static ArrayList<io.zipcoder.pets.Pet> petArrayList = new ArrayList<io.zipcoder.pets.Pet>();
    private static Scanner input = new Scanner(System.in);

    public Application () {
        // Null constructor
    }

    public ArrayList<Pet> getPetArrayList() {
        return petArrayList;
    }

    public static void main(String[] args) {
        String petName = input.nextLine();
    }

}

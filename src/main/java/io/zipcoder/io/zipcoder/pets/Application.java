package io.zipcoder.io.zipcoder.pets;

import io.zipcoder.PetUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetUtils pet = new PetUtils();


        System.out.println("Hi, how many pets do you have?");
        int numOfPets = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numOfPets; i++) {
            String petType;
            String petName;
            System.out.println("Aww, what kind of pet is # " + (i+1) + "?");
            petType = scanner.nextLine();

            System.out.println("Cute! Whats your " + petType + "'s name?");
            petName = scanner.nextLine();
            pet.addPet(petName, petType);
        }

            System.out.println("So, let me get this right, you have the following animals: ");

            System.out.println(pet.printList());

            }

    }

package io.zipcoder.pets;

import java.util.Arrays;
import java.util.Scanner;

public class PetFactory {

    public void userInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, how many pets do you have? ");
        int numberOfPets = sc.nextInt();
        sc.nextLine();
        Pet [] petsList = new Pet[numberOfPets];

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What kind of pet/pets are they?");
            String typeOfPet = sc.nextLine();
            System.out.println("What is the name of each of your pets?");
            String nameOfPet = sc.nextLine();

            if (typeOfPet.equalsIgnoreCase("Dog")) {
                petsList[i] = new Dog(nameOfPet);
            } else if (typeOfPet.equalsIgnoreCase("Cat")) {
                petsList[i] = new Cat(nameOfPet);
            } else if (typeOfPet.equalsIgnoreCase("Tariq")) {
                petsList[i] = new Tariq(nameOfPet);
            } else {
                System.out.println("Incorrect input");
            }

        }

        for (int j = 0; j < numberOfPets; j++) {

            System.out.println(petsList[j].getPetName() + " " + petsList[j].speak());
        }

        PetCompare petCompare = new PetCompare();
        Arrays.sort(petsList, petCompare);

        }
    }







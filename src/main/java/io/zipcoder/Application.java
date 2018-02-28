package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Application {
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Application application = new Application();
        application.start();

    }


    public void start() {
        System.out.println("How many pets do you have?");
        String numberOfPetsString = scanner.nextLine();
        int numberOfPets = Integer.parseInt(numberOfPetsString);

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What is the type of pet?");
            String typeOfPet = scanner.nextLine();

            System.out.println("What is the name of the pet?");
            String petName = scanner.nextLine();

            Pet pet = createPet(typeOfPet, petName);
            this.add(pet);

        }
        printPets();

    }


    public void printPets() {
        for (Pet pet : pets) {
            String petName = pet.getName();
            String petType = pet.getClass().getSimpleName();
            System.out.println("Pet name = " + petName);
            System.out.println("Pet type = " + petType);

        }

    }


    public Pet[] getPets() {
        int size = pets.size();
        Pet[] petArray = new Pet[size];
        for (int i = 0; i < pets.size(); i++) {
            Pet currentPet = pets.get(i);
            petArray[i] = currentPet;

        }
        return petArray;

    }


    public void add(Pet pet) {
        pets.add(pet);

    }


    public Pet createPet(String petType, String petName) {
        Pet pet = null;
        switch (petType.toLowerCase()) {
            case "bird":
                pet = new Cat(petName);
                break;

            case "dog":
                pet = new Dog(petName);
                break;

            case "snake":
                pet = new Reptile(petName);
                break;

            case "cat":
                pet = new Cat(petName);
                break;

        }
        return pet;

    }

}



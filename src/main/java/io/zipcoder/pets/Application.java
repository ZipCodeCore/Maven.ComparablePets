package io.zipcoder.pets;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public ArrayList<Pet> pets = new ArrayList<Pet>();
    int numPet;

    public String showPetList(ArrayList<Pet> pets) {
        StringBuilder petList = new StringBuilder();
        for (Pet pet : pets) {
            petList.append(pet.getName() + " : " + pet.speak() + "\n");
        }
        return petList.toString();
    }

    public int listPets() {
        Scanner petScanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numPet = petScanner.nextInt();
        return numPet;
    }

    public void askForPetInfo() {
        Scanner petScanner = new Scanner(System.in);
        for (int i = 0; i < numPet; i++) {
            System.out.println("What kind of pet/pets are they?");
            String typeOfPet = petScanner.nextLine();

            System.out.println("What is the name of that pet?");
            String petName = petScanner.nextLine();
        }
    }

    public void addPet(String typeOfPet, String petName) {
            Pet p;
            if (typeOfPet.equalsIgnoreCase("dog")) {
                pets.add(new Dog(petName));
            } else if (typeOfPet.equalsIgnoreCase("cat")) {
                p = new Cat(petName);
                pets.add(p);
            } else if (typeOfPet.equalsIgnoreCase("fish")) {
                p = new Fish(petName);
                pets.add(p);
            } else {
                System.out.println("We do not condone that type of pet");
            }
        }
}




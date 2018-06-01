package io.zipcoder.pets;

import io.zipcoder.pets.Pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {

    private ArrayList<Pets> petList;


    public Application() {
        this.petList = new ArrayList<Pets>();

    }

    public int askForPets() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number of pets you own:");
        return in.nextInt();
    }

    public ArrayList<Pets> createPetList() {
        int numberOfPets = askForPets();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Please enter type of pet for pet # " + (i + 1));
            String type = scan.nextLine();
            System.out.println("Please enter pet's name");
            String name = scan.nextLine();
            petList.add(PetFactory.createPets(type, name));
        }
        return petList;
    }

    public String petsToString(ArrayList<Pets> petList) {
        StringBuilder petString = new StringBuilder();
        for (Pets pet: petList) {
            petString.append("My name is ")
                    .append(pet.getName())
                    .append(" and I say ")
                    .append(pet.speak())
                    .append(".  ");
        }
        return petString.toString();

    }

    public ArrayList<Pets> sortPetsByType() {
        Collections.sort(petList, Comparator.comparing(Pets::getType).thenComparing(Pets::getName));
        return petList;
    }

    public ArrayList<Pets> sortPetsByName() {
        Collections.sort(petList, Comparator.comparing(Pets::getName).thenComparing(Pets::getType));
        return petList;
    }

}





package io.zipcoder.pets;

import io.zipcoder.pets.Pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private ArrayList<Pets> petList;


    public Application() {
        this.petList = new ArrayList<Pets>();

    }

    public String askForPets() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the number of pets you own:");
        int numberOfPets = in.nextInt();
        System.out.println("Please input each pet by type of pet followed by their name, no " +
                "punctuation marks please:");
        String x = in.nextLine();
        String allPets = in.nextLine();
        return allPets;
    }

    public ArrayList<Pets> createPetList(String allPets) {
        String[] petArrayString = allPets.split(" ");
        for(int i = 0; i< petArrayString.length; i+=2) {
            petList.add(PetFactory.createPets(petArrayString[i], petArrayString[i+1]));
        }
        return petList;
    }

    public String petsToString() {
        String petString = "";
        for(int i=0; i<petList.size(); i++) {
            petString += "My name is " +  petList.get(i).getName() + " and I say " +
                    petList.get(i).speak() + ".  ";
        }
        return petString;
    }



}

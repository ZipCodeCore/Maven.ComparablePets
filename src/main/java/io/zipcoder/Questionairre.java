package io.zipcoder;

import io.zipcoder.Pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Questionairre {

    protected int numOfPets;
    protected ArrayList<Pet> petArrayList;

    public Questionairre(){
        petArrayList = new ArrayList<>();
    }

    public void numOfPetsPrompt() {
        Console.print("Hello dear user. How many pets do you have?");
        numOfPets = Console.getInt();
    }

    public void setPetArrayList(){
        Console.print("Thanks! What kind of pets do you have? Please specify using only the following:");
        for (int i = 0; i < numOfPets; i++) {
            Console.print(Arrays.toString(PetTypes.values()));
            String usersKindOfPets = Console.getString();
            Console.print("What's their name?");
            String name = Console.getString();
            Console.print("How old is this pet?");
            int age = Console.getInt();
            Pet tempPet;
            petTypeSwitch(usersKindOfPets, name, age);
            PetOwner newOwner = new PetOwner(petArrayList);
        }
    }

    public void speakNSay() {
        String petList = "";
        for (Pet currentPet:petArrayList) {
            petList += ("The " + currentPet.getClass().getSimpleName() + " named " + currentPet.getName()
            + " says " + currentPet.speak() + ". ");
        }
        System.out.println(petList);
    }

    public void petListSort() {
        Collections.sort(petArrayList, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            }
        });
        for (Pet pet:petArrayList) {
            System.out.println(pet.getName());
        }
    }

    public void petTypeSwitch(String usersKindOfPets, String name, int age) {
        Pet tempPet;
        switch (usersKindOfPets.toLowerCase()) {
            case "cat":
                tempPet = new Cat(name, age);
                petArrayList.add(tempPet);
                break;
            case "dog":
                tempPet = new Dog(name, age);
                petArrayList.add(tempPet);
                break;
            case "capybara":
                tempPet = new Capybara(name, age);
                petArrayList.add(tempPet);
                break;
        }
    }
}

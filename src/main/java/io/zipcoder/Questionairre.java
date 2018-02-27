package io.zipcoder;

import io.zipcoder.Pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Questionairre {

    protected int numOfPets;
    protected ArrayList<Pet> petArrayList;

    public Questionairre(){
        petArrayList = new ArrayList<>();
    }

    public ArrayList<Pet> getPetArrayList() {
        return petArrayList;
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
            petTypeSwitch(usersKindOfPets, name, age);
        }
    }

    public String speakNSay() {
        String petList = "";
        for (Pet currentPet:petArrayList) {
            petList += ("The " + currentPet.getClass().getSimpleName() + " named " + currentPet.getName()
            + " says " + currentPet.speak() + ". ");
        }
        System.out.println(petList);
        return petList;
    }

    public void petListTypeSort() {
        Collections.sort(petArrayList, new SortByPetType());
        for (Pet pet:petArrayList) {
            System.out.println(pet.getName());
        }
    }

    public void petListNameSort() {
        Collections.sort(petArrayList);
        for (Pet pet:petArrayList){
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

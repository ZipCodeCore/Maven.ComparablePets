package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Application {

    private int numberOfPets;
    protected ArrayList<Pet> pets = new ArrayList<Pet>();
    Scanner input = new Scanner(System.in);

    public int storePetInformation(){
        System.out.println("How many pets do you own?");
        numberOfPets = input.nextInt();
        for(int i = 0; i<numberOfPets; i++){
            pets.add(userInputEachPet());
        }
        return numberOfPets;
    }

    public Pet userInputEachPet(){
        System.out.println("Type of pet?");
        String typeOfPet = input.next();

        System.out.println("What is the pet's name?");
        String nameOfPet = input.next();
        Pet pet = new Pet(nameOfPet);
        if(typeOfPet.equalsIgnoreCase("Cat")){
            pet = new Cat(nameOfPet);
        }
        else if (typeOfPet.equalsIgnoreCase("Dog")){
            pet = new Dog(nameOfPet);
        }
        else if(typeOfPet.equalsIgnoreCase("Bird")){
            pet = new Bird(nameOfPet);
        }
        return pet;
    }

    public String petNameAndSpeak(ArrayList<Pet> pets) {
        StringBuilder petList = new StringBuilder();
        for(int i = 0; i < pets.size(); i++) {
            petList.append(pets.get(i).getName() + " " + pets.get(i).speak()+"\n");
        }
        System.out.println(petList.toString().trim());
        return petList.toString().trim();
    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }
    public static void main(String [] args){
        Application application = new Application();
        application.storePetInformation();
        application.petNameAndSpeak(application.pets);
    }

}
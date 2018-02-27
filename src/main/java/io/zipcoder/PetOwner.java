package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class PetOwner {
    CompareAnimal compareAnimal = new CompareAnimal();
    Scanner userInput = new Scanner(System.in);
    static final ArrayList<Pet> petList = new ArrayList<Pet>();
    private Integer numberOfPets;



    public Integer askUserForNumberPets(){
        System.out.println("Please enter the number of pets you have");
        numberOfPets = Integer.parseInt(userInput.nextLine());
        return numberOfPets;
    }

    public String askUserForPetName(){
        System.out.println("What is your pet's name?");
        String petName = userInput.nextLine();
        return petName;
    }

    public String askUserForPetType(){
        System.out.println("What type of pet do you have?");
        String petType = userInput.nextLine();
        return petType;
    }

    public void addPetsToList(Integer numberOfPets){
        for (int i =0; i < numberOfPets; i++){
            String name =  askUserForPetName();
            String type = askUserForPetType();
            petList.add(PetFactory.createPet(type, name));
        }
    }

    public static String printPetList(ArrayList<Pet> petList){
      StringBuilder petListToString = new StringBuilder();
      for (Pet pet: petList){
          petListToString.append(pet.getPetName());
          petListToString.append(" the ");
          petListToString.append(pet.getClass().getSimpleName());
          petListToString.append(" says ");
          petListToString.append(pet.speak() + "\n");

      }
        String actualPetListToString = petListToString.toString();
        System.out.println(petListToString.toString());
        return actualPetListToString;
    }

    public void start(){
        this.askUserForNumberPets();
        this.addPetsToList(numberOfPets);
        this.printPetList(petList);
    }

}

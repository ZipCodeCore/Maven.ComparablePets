package io.zipcoder;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private int numberOfPets;
    protected ArrayList<Pet> pets = new ArrayList<Pet>();
    Scanner scanner = new Scanner(System.in);

    public int storePetInformation(){
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
        for(int i=0;i<numberOfPets;i++){
            pets.add(promptUserForIndividualPet());
        }

        return numberOfPets;
    }

    public Pet promptUserForIndividualPet(){
        System.out.println("What kind of pet?");
        String typeOfPet = scanner.next();

        System.out.println("What is your pet's name?");
        String nameOfPet = scanner.next();
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

    public String petListWithNameAndSound(ArrayList<Pet> pets){
        StringBuilder petList = new StringBuilder();
        for(int i=0;i<pets.size();i++){
            petList.append(pets.get(i).getName() + " " +pets.get(i).speak()+"\n");
            System.out.println("Adding "+ pets.get(i).getName()+ " to list");
        }
        System.out.print(petList.toString().trim());
        return petList.toString().trim();
    }
    //add pet to arraylist just for testing
    public void addPet(Pet pet){
        pets.add(pet);
    }
    public static void main(String [] args){
        Application application=new Application();
        application.storePetInformation();
        application.petListWithNameAndSound(application.pets);

    }
}


package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Snake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application {

    private Scanner userInput = new Scanner(System.in);
    private HashMap<String, String> petsMap = new HashMap<String, String>();
    private ArrayList<Pet> petList = new ArrayList<Pet>();

    public void howManyPets(){
        System.out.println("How many pets do you have?");
        int numberOfPets = Integer.parseInt(getUserInput());
        askPetName(numberOfPets);
    }

    public void askPetName(int numberOfPets) {
        String[] petNames = new String[numberOfPets];
        for (int i = 0 ; i < petNames.length ; i++){
            System.out.println("What is the name for pet number " + (i + 1) + "?");
            String petName = getUserInput();
            petNames[i] = petName;
        }
        askPetType(petNames);
    }

    public void askPetType(String[] petNames){
        for (int i = 0; i < petNames.length; i++) {
            String petBreed;
            do {
                System.out.println("What type of pet is " + petNames[i] + "?\nCat\nDog\nSnake");
                petBreed = getUserInput();
            } while (!(petBreed.equals("Cat")) && !(petBreed.equals("Dog")) && !(petBreed.equals("Snake")));
            createPetList(petBreed, petNames[i]);
        }

    }

    public void printListOfPets() {
        for (Pet pet: petList) {
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public void createPetList(String petBreed, String petName){
        if (petBreed.equals("Cat")){
            Cat cat = new Cat();
            cat.setName(petName);
            petList.add(cat);
        }else if (petBreed.equals("Dog")){
            Dog dog = new Dog();
            dog.setName(petName);
            petList.add(dog);
        } else if (petBreed.equals("Snake")) {
            Snake snake = new Snake();
            snake.setName(petName);
            petList.add(snake);
        }
    }

    private String getUserInput() {
        return userInput.nextLine();
    }


    public void setPetsMap(String petName, String petBreed) {
        this.petsMap.put(petName, petBreed);
    }

    public void setPetList(Pet pet){
        petList.add(pet);
    }
    public ArrayList<Pet> getPetList() {
        return this.petList;
    }


}

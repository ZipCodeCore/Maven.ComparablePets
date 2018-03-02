package io.zipcoder;


import java.util.Scanner;

public class Application {

    Scanner userInput = new Scanner(System.in);
    int numberOfPets;
    String petType;
    String petName;

    public static void main(String[] args) {
        Application app = new Application();
        app.setNumberOfPets();
        app.buildPetInventory();
    }

    public void setNumberOfPets() {

        System.out.println("Hello. How many cool pets do you have?\n(Cool pets are defined as dogs, cats or otters)");
        numberOfPets = userInput.nextInt();
    }


    public void buildPetInventory() {

        PetInventory newInventory = new PetInventory();
        System.out.println("Tell me one pet at a time...");

        while (numberOfPets > 0) {
            System.out.println("What is your pet type?");
            petType = userInput.next();

            System.out.println("And its name?");
            petName = userInput.next();

            newInventory.addPet(petType, petName);

            numberOfPets--;

            if (numberOfPets > 0) {
                System.out.println("Thanks. Next...");
            }
        }

        System.out.println("Okay, that's it! These are your cool, loud pets:");
        System.out.println(newInventory.listPetsAndSpeak());
    }

    public String getPetType() {
        return petType;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    public String getPetName() {
        return petName;
    }
}

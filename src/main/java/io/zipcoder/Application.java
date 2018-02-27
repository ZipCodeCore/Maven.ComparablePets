package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    String petOwnerName;
    int numberOfPetsOwned;
    Scanner userInput= new Scanner(System.in);
    String petName;
    String petType;
    ArrayList<String> petCollector = new ArrayList<>();

    public static void main(String[] args) {

    }

    public String petOwner() {
        System.out.println("It is to your great fortune that we should cross each others paths.  I am Awesome-O " +
                "\nand I have a few favors to as of you.  Would you please be so kind as to tell me your name?");
        petOwnerName = userInput.next();
        userInput.nextLine();
        return petOwnerName;
    }

    public Integer numberOfPets() {


        System.out.println("Where are my manners... Hello" + petOwnerName + "! Its a pleasure to meet your" +
                " acquaintance.  Would you be so kind as to tell me how many pets do you own? " +
                "(please enter an integer).");

            if (userInput.nextInt() > 0) {
                numberOfPetsOwned = userInput.nextInt();
            } else {
                System.out.println("Please choose a number that is greater than or equal to 0");
                numberOfPetsOwned = userInput.nextInt();
            }
        userInput.nextLine();
        return numberOfPetsOwned;
    }

    public void getPetCollection() {

        for (int i = 0; i < numberOfPetsOwned; i ++) {
            System.out.println("What is the name of pet #" + (i+1) +" ?");
            petName = userInput.nextLine();
            System.out.println("Please identify the type of pet (Dog, Cat or Snake)" + "that " + petName + "is.");
            petType = userInput.nextLine();
            this.petCollector.add(PetFactory.petCreator(petType, petName));

        }
    }

}

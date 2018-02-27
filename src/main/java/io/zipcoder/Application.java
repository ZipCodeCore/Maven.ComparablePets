package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Application {

    ArrayList<Pet> pets = new ArrayList<Pet>();

    //split into own method
    Scanner input = new Scanner(System.in);
public String petInformation() {
    System.out.println("How many pets do you own?");
    int numberOfPets = input.nextInt();
    input.nextLine();

    for (int i = 1; i <= numberOfPets; i++) {
        System.out.println("What type of pet is pet number " + i + "?");
        String typeOfPet = input.nextLine();

        if ("dog".equalsIgnoreCase(typeOfPet)) {

            System.out.println("What is the name of your dog?");
            String dogName = input.nextLine();

            pets.add(new Dog(dogName));
        } else if ("cat".equalsIgnoreCase(typeOfPet)) {

            System.out.println("What is the name of your cat?");
            String catName = input.nextLine();

            pets.add(new Cat(catName));
        } else if ("bird".equalsIgnoreCase(typeOfPet)) {

            System.out.println("What is the name of your bird?");
            String birdName = input.nextLine();

            pets.add(new Bird(birdName));
        } else {
            System.out.println("Sorry, I pretty much only care about your story if you own a dog ," +
                    "cat, or bird. Not a " + input);
        }
    }
StringBuilder sb = new StringBuilder();
    for (Pet pet : pets) {
        System.out.println(pet.getName() + " says, " + pet.speak());
        sb.append(pet.getName() + " says, " + pet.speak());
    }
    return sb.toString();
}


    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        Scanner input = new Scanner(System.in);

        System.out.println("How many pets do you own?");
        int numberOfPets = input.nextInt();
        input.nextLine();

        for(int i = 1; i <= numberOfPets; i++) {
            System.out.println("What type of pet is pet number " + i + "?");
            String typeOfPet = input.nextLine();

            if("dog".equalsIgnoreCase(typeOfPet)) {

                System.out.println("What is the name of your dog?");
                String dogName = input.nextLine();

                pets.add(new Dog(dogName));
            }
            else if ("cat".equalsIgnoreCase(typeOfPet)) {

                System.out.println("What is the name of your cat?");
                String catName = input.nextLine();

                pets.add(new Cat(catName));
            }
            else if("bird".equalsIgnoreCase(typeOfPet)) {

                System.out.println("What is the name of your bird?");
                String birdName = input.nextLine();

                pets.add(new Bird(birdName));
            }
            else {
                System.out.println("Sorry, I pretty much only care about your story if you own a dog ," +
                        "cat, or bird. Not a " + input);
            }
        }

        for(Pet pet : pets) {
            System.out.println(pet.getName() + " says, " + pet.speak());
        }

    }

}

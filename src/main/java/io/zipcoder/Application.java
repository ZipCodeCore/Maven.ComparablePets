package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import io.zipcoder.Pets.Racoon;

import java.util.*;

public class Application {
    List<Pet> pets = new ArrayList<Pet>();
    Integer numPets;


    public Application() {
        numPets = 0;

    }

    public int askForNumPets() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numPets = inputScanner.nextInt();
        return numPets;
    }

    public void askForPetInfo() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numPets; i++) {
            System.out.println("What kind of pet?");
            String typeOfPet = sc.nextLine();

            System.out.println("What is the name of the pet?");
            String petName = sc.nextLine();
        }
    }

    public String showPetList(List<Pet> pets) {
        StringBuilder builder = new StringBuilder();
        for (Pet pet: pets) {
            builder.append((pet.getName()) + ": " + pet.speak() + "\n");
        }
        return builder.toString();
    }

    public void addPet(String typeOfPet, String petName) {
            Pet p;
            if(typeOfPet.equalsIgnoreCase("Dog")) {
                p = new Dog(petName);
                this.pets.add(p);
            }
            else if(typeOfPet.equalsIgnoreCase("Cat")) {
                p = new Cat(petName);
                this.pets.add(p);
            }
            else if(typeOfPet.equalsIgnoreCase("Racoonv")) {
                p = new Racoon(petName);
                this.pets.add(p);
            }
            else {
                System.out.println("You cannot do this");
            }
        }

}

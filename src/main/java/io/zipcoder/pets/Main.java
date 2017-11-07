package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    enum PetType {CAT, DOG, FISH, PANGOLIN}

    public static void main(String[] args) {

        ArrayList<Pets> userPets = new ArrayList<Pets>();


        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = sc.nextInt();


        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What type of pet do you have?");
            String petType = sc.next();
            System.out.println("What is your pets name?");
            String petName = sc.next();
            switch (PetType.valueOf(petType.toUpperCase())) {
                case DOG:
                    userPets.add(new Dog(petName));
                    break;
                case CAT:
                    userPets.add(new Cat(petName));
                    break;
                case FISH:
                    userPets.add(new Fish(petName));
                    break;
                case PANGOLIN:
                    userPets.add(new Pangolin(petName));
                    break;
            }
        }


        for (Pets pets : userPets) {
            System.out.println(pets.getName() + " goes " + pets.getClass().getName());
        }

        System.out.println("\n");

        Collections.sort(userPets);

        for (Pets pets : userPets) {
            System.out.println(pets.getName() + " goes " + pets.getClass().getName());
        }/**/


    }
}

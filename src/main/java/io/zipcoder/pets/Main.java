package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pets> userPets = new ArrayList<Pets>();


        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = sc.nextInt();


//        userPets.add(new Fish("joe"));
//        userPets.add(new Dog("joe"));
//        userPets.add(new Cat("joe"));
//        userPets.add(new Cat("zebra"));

        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What type of pet do you have?");
            String petType = sc.next();
            System.out.println("What is your pets name?");
            String petName = sc.next();
            if ("Dog".equalsIgnoreCase(petType)) {
                userPets[i]=new Dog(petName);
            } else if ("Cat".equalsIgnoreCase(petType)) {
                userPets[i]=new Cat(petName);
            } else if ("Fish".equalsIgnoreCase(petType)) {
                userPets[i]=new Fish(petName);
            }
        }


        for (Pets pets : userPets) {
            System.out.println(pets.getName() + " goes " + pets.getClass().getName());
        }

        System.out.println("\n");

        Collections.sort(userPets);

        for (Pets pets : userPets) {
            System.out.println(pets.getName() + " goes " + pets.getClass().getName());
    }
}}

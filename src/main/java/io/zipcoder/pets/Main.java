package io.zipcoder.pets;

import java.util.*;

public class Main {

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
            if ("Dog".equals(petType)) {
                userPets.add(new Dog(petName));
            } else if ("Cat".equals(petType)) {
                userPets.add(new Cat(petName));
            } else if ("Fish".equals(petType)) {
                userPets.add(new Fish(petName));
            }
        }

        Collections.sort(userPets);
        for (Pets pets : userPets) {
            System.out.println(pets.getName() + " goes " + pets.speak());
        }
    }
}

//while (userPets.length < numOfPets) { }
//it will continue to loop until the user enters in the numOfPets that correspond to the instances we created.
// b/c arraylist length will not grow until a new Pet is added!
package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Falcon;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        ArrayList<Pet> pets = new ArrayList<Pet>();
//        String storage = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int numberOfPets = keyboard.nextInt();
        keyboard.nextLine();

        for(int i = 1; i <= numberOfPets; i++) {
            System.out.println("What type of pet is pet number " + i + "?");
            String type = keyboard.nextLine();

            if("dog".equalsIgnoreCase(type)) {

                System.out.println("What is the name of your dog?");
                String name = keyboard.nextLine();

                pets.add(new Dog(name));
            }
            else if ("cat".equalsIgnoreCase(type)) {
                System.out.println("What is the name of your cat?");
                String name = keyboard.nextLine();

                pets.add(new Cat(name));
            }
            else if("falcon".equalsIgnoreCase(type)) {
                    System.out.println("HOW WOULD YOU NAME SUCH A MAJESTIC BEAST?");
                    String name = keyboard.nextLine();

                pets.add(new Falcon(name));
            }
            else {
                continue;
            }

        }

        Collections.sort(pets);

        for (Pet pet : pets) {
            System.out.print(pet.getName() + " says, ");
            pet.speak();
        }


    }



}


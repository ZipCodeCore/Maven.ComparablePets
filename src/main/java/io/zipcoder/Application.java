package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        ArrayList<String> petMap = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many pets do you have?");
        Integer numOfPets = sc.nextInt();
        sc.nextLine();

        for(Integer i = 0; i<numOfPets; i++){
            System.out.println("For each pet, what kind of pet is it?");
            String pet = sc.nextLine();
            System.out.println("What's the name of your pet?");
            String petName = sc.nextLine();
            petMap.add(pet);
            petMap.add(petName);

        }

        for(String i : petMap){
            System.out.printf("This pet is a %s need %s%n", i, petMap.get(Integer.parseInt(i)));
        }
    }
}

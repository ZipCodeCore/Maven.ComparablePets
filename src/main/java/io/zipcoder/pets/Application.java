package io.zipcoder.pets;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private final ArrayList<Pet> petArrayList;

    public Application(){
        this.petArrayList = new ArrayList<Pet>();
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have? ");
        String quantity = sc.nextLine();
        System.out.println("What kind of pets do you have?");
        String type = sc.nextLine();
        System.out.println("What are your pets' names?");
        String names = sc.nextLine();

        System.out.println("Number of Pets: " + quantity + "\n" + "Kind of pets: " + type + "\n" + "Pets names: " + names);
    }

}

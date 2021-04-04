package io.zipcoder;


import java.util.Scanner;

public class Application {

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    String name = "";
 /*   System.out.println("What is your pets name?");
    String petName = scn.nextLine();
    System.out.println("Your pets name is " + petName);*/
    System.out.println("These are the pets we have available. Koala, Cat, and Dog.");
    String animal = scn.next();
    switch(animal) {
        case "Koala":
            while (true){

            Koala k = new Koala();

            System.out.println("Whats your Koala's name?");
            name = scn.next();
            System.out.println("They sound like this " + k.speak() + " Your pets name is " + name);
                break;
            }

        }

    }

}

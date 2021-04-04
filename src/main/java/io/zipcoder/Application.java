package io.zipcoder;


import java.util.Scanner;

public class Application {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your pet's name?");
        String petName = scanner.nextLine();
        System.out.println("Your pat's name is " + petName + ".");
        System.out.println("These are the pets that we have available...");
        System.out.println("1 for LLama, 2 for Cat, 3 for Dog, 4 for Bird");

        String animal = scanner.next();
        switch(animal) {
            case "Llama":
                Llama llama = new Llama();
                System.out.println("what would you like to call you Llama?");
                //
                // String petName = scanner.nextLine();
                System.out.println("The sound like this " + llama.speak + " /n Your pet's name is " + petName);
                break;
        }



    }





}

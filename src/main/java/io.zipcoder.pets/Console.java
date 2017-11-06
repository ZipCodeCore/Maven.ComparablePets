package io.zipcoder.pets;

import java.util.Arrays;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {


        int numPets = 0;


        numPets = getPositiveInt("How many pets do you have?");


        Pet[] allPets= new Pet[numPets];
        String petType;
        String petName;

        for(int i = 1; i <= numPets; i++){
            petType = getPetType("Pet number " + i + ". What type of pet is it?").toUpperCase();
            petName = getString("What is it's name?");

            switch(petType){
                case "CAT":
                    allPets[i-1] = new Cat(petName);
                    break;
                case "DOG":
                    allPets[i-1] = new Dog(petName);
                    break;
                case "DEMODOG":
                    allPets[i-1] = new DemoDog(petName);
                    break;
            }

        }

        System.out.println("Sorted by Name:");
        System.out.println("********************");
        NameChecker NameChecker = new NameChecker();
        Arrays.sort(allPets, NameChecker);

        for(int i = 0; i < numPets; i++){
            System.out.println(allPets[i].getName() + " says " + allPets[i].speak());
        }

        System.out.println();
        System.out.println("Sorted by Type:");
        System.out.println("********************");
        TypeChecker typeChecker = new TypeChecker();
        Arrays.sort(allPets,typeChecker);

        for(int i = 0; i < numPets; i++){
            System.out.println(allPets[i].getName() + " says " + allPets[i].speak());
        }


    }

    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static String getPetType(String prompt) {
        sc = new Scanner(System.in);
        System.out.println(prompt);
        String input;
        boolean validInput = false;
        do {
            input = sc.nextLine();
            if("CAT".equalsIgnoreCase(input) || "DOG".equalsIgnoreCase(input) || "DEMODOG".equalsIgnoreCase(input)) {
                validInput = true;
            }
            else {
                System.out.println("Not a valid pet type. Try again. [CAT] [DOG] [DEMODOG]");
            }
        } while(!validInput);

        return input;
    }

    public static int getPositiveInt(String prompt){
        sc = new Scanner(System.in);
        System.out.println(prompt);
        int iInput;
        String sInput;
        boolean validInput = false;
        do {
            sInput = sc.nextLine();
            if (!isInputInt(sInput)||(Integer.valueOf(sInput)<0)) {
                System.out.println("Please enter an integer number greater than 0.");
            }
            else{
                validInput = true;
            }
        }while (!validInput);
        iInput=Integer.valueOf(sInput);
        return iInput;
    }

    private static boolean isInputInt(String passedString) {
        try {
            Integer output = Integer.valueOf(passedString);
        } catch (NumberFormatException e) {
            return false;
        }
        return (true);
    }
}

package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    //    Scanner userInput = new Scanner(System.in);
//
//    public Integer numberofPets(){
//    System.out.println("How many pets do you have?");
//    Integer inputNumber = Integer.parseInt(userInput.nextLine());
//   return inputNumber;
//    }
//
//    public String userPetName(){
//        System.out.println("What is your pets name?");
//        String inputName = userInput.nextLine();
//        return inputName;
//    }
//
//    public String userPetType(){
//        System.out.println("What kind of animal is your pet?");
//        String inputType = userInput.nextLine();
//        return inputType;
//    }
//    Scanner userInput = new Scanner(System.in);
//    ArrayList<Pet> myPetList = new ArrayList<Pet>();
//
//    public String numberofPets() {
//        System.out.println("How many pets do you have?");
//        Integer inputNumber = Integer.parseInt(userInput.nextLine());
//        int i = inputNumber;
//        for (int x = 0; x < i; x++) {
//            System.out.println("What is your pets name?");
//            String inputName = userInput.nextLine();
//            String newPetName = inputName;
//
//            System.out.println("What kind of animal is your pet?");
//            String inputType = userInput.nextLine();
//            String newPetType = inputType;
//
//            myPetList.add(PetFactory.createPet(newPetName, newPetType));
//
//        }
//        return myPetList.toString();
//
//    }

    public static void main(String[] args) {
        PetOwner petowner = new PetOwner();
        petowner.start();

    }

}

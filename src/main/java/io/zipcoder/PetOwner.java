package io.zipcoder;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class PetOwner {
    Scanner userInput = new Scanner(System.in);
    ArrayList<Pet> myPetList = new ArrayList<Pet>();

    public String numberofPets() {
        System.out.println("How many pets do you have?");
        Integer inputNumber = Integer.parseInt(userInput.nextLine());
        int i = inputNumber;
        for (int x = 0; x < i; x++) {
            System.out.println("What is your pets name?");
            String inputName = userInput.nextLine();
            String newPetName = inputName;

            System.out.println("What kind of animal is your pet?");
            String inputType = userInput.nextLine();
            String newPetType = inputType;

            myPetList.add(PetFactory.createPet(newPetName, newPetType));

        }

        String answer = myPetList.toArray().toString();
        System.out.println(printList(myPetList));
        return answer;
    }
    public void start(){
        this.numberofPets();
        this.toString();

    }

    public static String printList(ArrayList<Pet> myPetList){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <myPetList.size(); i++){
            sb.append(myPetList.get(i).getName());
            sb.append(" is a ");
            sb.append(myPetList.get(i).getClass().getSimpleName()+"\n");
        }
        return sb.toString();
    }

    }


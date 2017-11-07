package io.zipcoder;
import io.zipcoder.pet.*;
import java.util.*;

class Application {

    private Scanner scan = new Scanner(System.in);

    void start() {
        Owner owner = new Owner(getUserName());
        setPets(owner);
        sortPets(owner);
        printInfo(owner);
    }

    private String getUserName() {
        System.out.println("What is your name?");
        //String input = scan.next();
        return scan.next();
    }

    private void setPets(Owner owner) {
        System.out.println("How many pets do you have?");
        int numberOfPets = getInt();
        for (int i = 0; i < numberOfPets; i++) {
            Pet newPet = getPetInfo();
            owner.addPet(newPet);
        }
    }

    private int getInt() {
        String input;
        int output;
        while (true) {
            input = scan.next();
            try {
                output = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("invalid input");
                //continue;
            }
        }
        return output;
    }

    private Pet getPetInfo() {
        System.out.println("what type of pet? (Dog,Cat,LLama)");
        Pet newPet = returnPetType();
        System.out.println("What is it's name?");
        String name = scan.next();
        newPet.setName(name);
        return newPet;
    }

    private Pet returnPetType() {
        String input = scan.next();
        Pet petOutput;
        switch (input.toLowerCase()) {
            case "dog":
                petOutput = new Dog();
                break;
            case "cat":
                petOutput = new Cat();
                break;
            case "llama":
                petOutput = new Llama();
                break;
            default:
                System.out.println("Invalid input");
                petOutput = returnPetType();
        }
        return petOutput;
    }

    private void sortPets(Owner owner) {
        System.out.println("How would you like to sort your pets? (Name, Type)");
        boolean flag = true;
        while (flag) {
            String input = scan.next();
            if ("name".equalsIgnoreCase(input)) {
                Collections.sort(owner.pets);
                flag = false;
            } else if ("type".equalsIgnoreCase(input)) {
                Comparator<Pet> classSort = new Checker();
                Collections.sort(owner.pets, classSort);
                flag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    private void printInfo(Owner owner) {
        ArrayList<Pet> userPets = owner.getPets();
        System.out.println(owner.toString());
        for (Pet currentPet : userPets) {
            System.out.println("\t" + currentPet.toString());
        }
    }
}

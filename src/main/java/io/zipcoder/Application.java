package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    static Scanner scan = new Scanner(System.in);

    public void start() {

        System.out.println("What is your name?");
        String input = scan.next();
        User user = new User(input);
        setPets(user);
        printInfo(user);
    }

    public void printInfo(User user){
        ArrayList<Pet> userPets = user.getPets();
        System.out.println(user.toString());
        for(Pet currentPet : userPets){
            System.out.println("\t"+currentPet.toString());
        }
    }


    public void setPets(User user) {
        System.out.println("How many pets do you have?");
        int numberOfPets = getInt();
        for (int i = 0; i < numberOfPets; i++) {
            Pet newPet = getPetInfo();
            user.addPet(newPet);
        }
    }

    public Pet getPetInfo(){
        System.out.println("what type of pet? (Dog,Cat,LLama)");
        Pet newPet = returnPetType();
        System.out.println("What is it's name?");
        String name = scan.next();
        newPet.setName(name);
        //System.out.println(name +" says "+newPet.speak());
        return newPet;
    }

    public Pet returnPetType(){
        String input = scan.next();
        Pet petOutput;
        switch(input.toLowerCase()){
            case "dog":
                petOutput= new Dog();
                break;
            case "cat":
                petOutput = new Cat();
                break;
            default:
                petOutput = new Llama();
        }
        return petOutput;
    }

    public int getInt(){
        String input;
        int output;
        while(true){
            input = scan.next();
            try{
                output = Integer.parseInt(input);
                break;
            }catch(Exception e){
                System.out.println("invalid input");
                continue;
            }
        }
        return output;
    }


}

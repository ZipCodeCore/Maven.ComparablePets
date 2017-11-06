package io.zipcoder;
import io.zipcoder.pet.*;
import java.util.*;

public class Application {

    Scanner scan = new Scanner(System.in);

    public void start() {
        User user = new User(getUserName());
        setPets(user);
        sortPets(user);
        printInfo(user);
    }

    public String getUserName(){
        System.out.println("What is your name?");
        String input = scan.next();
        return input;
    }

    public void sortPets(User user){
        System.out.println("How would you like to sort your pets? (Name, Type)");
        boolean flag = true;
        while(flag) {
            String input = scan.next();
            if ("name".equalsIgnoreCase(input)) {
                Collections.sort(user.pets);
                flag = false;
            } else if ("type".equalsIgnoreCase(input)) {
                Comparator<Pet> classSort = new Checker();
                Collections.sort(user.pets, classSort);
                flag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
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
            case "llama":
                petOutput = new Llama();
                break;
            default:
                System.out.println("Invalid input");
                petOutput = returnPetType();
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

package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Llama;
import io.zipcoder.pets.Pets;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    Scanner userinput = new Scanner(System.in);

    public void start() {

        User newuser = new User(getName());
        setPets(newuser);
        printinfo(newuser);

    }

    private void printinfo(User newuser) {
        ArrayList<Pets> userpets = newuser.getPets();
        System.out.println(newuser.getName() + " has " + newuser.pets.size() + " pets.");
        for(Pets pets : userpets){
            System.out.println("\t" + pets.tostring());
        }
    }

    public String getName() {
        System.out.println("Whats your name?");
        return userinput.nextLine();
    }

    public int getInt() {
        System.out.println("How many pets do you have?");

        String input;
        int output;
        while (true) {
            input = userinput.next();
            try {
                output = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("INVALID");
                continue;
            }
        }
        return output;
    }

    public void setPets(User user) {
        System.out.println("How many pets do you have?");
        int numberofpets = userinput.nextInt();

        for (int i = 0; i < numberofpets; i++) {
            Pets newpet = getPetInfo();
            user.addPet(newpet);
        }

    }

    public Pets getPetInfo() {
        System.out.println("What type of pet? Dog/Cat/Llama");
        Pets newPet = returnPetType();
        System.out.println("What is its name?");
        String petname = userinput.next();
        newPet.setName(petname);
        return newPet;
    }

    public Pets returnPetType() {
        String input = userinput.next();
        Pets petoutput;
        switch (input) {
            case "dog":
                petoutput = new Dog();
                break;
            case "cat":
                petoutput = new Cat();
                break;
            default:
                petoutput = new Llama();
        }
        return petoutput;
    }


}

package io.zipcoder;


import io.zipcoder.pets.Pet;

import java.util.*;

public class Application {
    public Integer numberOfPets;
    //public ArrayList<String> listOfPetTypes;
    //public ArrayList<String> listOfPetNames;
    public HashMap<String,String> listOfPets;
    Scanner userInput = new Scanner(System.in);

    public void getPetInfo(){
        System.out.println("How many pets do you have?");
        numberOfPets = userInput.nextInt();

        for(int i = 0; i< numberOfPets; i++){
            String type;
            String name;
            System.out.println("What type of pet is pet " + (i+1) + "?");
            type = userInput.nextLine();
            System.out.println("What is the name of that "+ type +"?");
            name = userInput.nextLine();
            listOfPets.put(type,name);
        }
    }

    public

    public String printPetInfo(){
        StringBuilder builder = new StringBuilder();
        Iterator<String> key = listOfPets.keySet().iterator();
        while(key.hasNext()){
            builder.append("This person has a " + key + " named " + listOfPets.get(key) + "\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Application main = new Application();
        main.getPetInfo();
        System.out.println(main.printPetInfo());
    }



}
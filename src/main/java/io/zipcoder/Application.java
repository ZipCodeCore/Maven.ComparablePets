package io.zipcoder;


import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application {

    private Integer numberOfPets = 0;

    private ArrayList<String> petTypes = new ArrayList<String>();
    private ArrayList<String> petNames = new ArrayList<String>();
    private ArrayList<Pet> collectionOfPets = new ArrayList<Pet>();

    private HashMap<String, String> listOfPets = new HashMap<String, String>();

    Scanner userInput = new Scanner(System.in);

    public void buildCollectionOfPets(){

        System.out.println("How many pets do you have? ");

        this.setNumberOfPets(Integer.valueOf(userInput.nextLine()));

        for(int i = 0; i < this.getNumberOfPets(); i++){

            String name;
            String type;
            System.out.println("What kind of pet is pet " + (i + 1) + "?");

            type = userInput.nextLine();

            System.out.println("What is the name of that pet " + (i + 1) + "?");

            name = userInput.nextLine();

            this.collectionOfPets.add(PetFactory.createPet(type, name));

        }

    }

    public void makePetsSpeak(){
        for (Pet pet : collectionOfPets){
            System.out.println("Your " + pet.getClass().getSimpleName() +
                    " name " + pet.getName() + " says " + pet.speak());
        }

    }

    public void buildPetMap(ArrayList<String> types, ArrayList<String> names){

        for(int i = 0; i < types.size(); i++){
            listOfPets.put(types.get(i), names.get(i));
        }

    }

    public String getPetFromMap(String key){
        return this.listOfPets.get(key);
    }



    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public int getNumberOfPets(){
        return this.numberOfPets;
    }

    public String getPetType(int index){
        return this.petTypes.get(index);
    }

    public void setPetType(String petType){
        this.petTypes.add(petType);
    }

    public String getPetName(int index){
        return this.petNames.get(index);

    }

    public void setPetName(String name){
        this.petNames.add(name);
    }

    public static void main(String[] args) {
        Application app = new Application();

        app.buildCollectionOfPets();
        app.makePetsSpeak();
    }

}

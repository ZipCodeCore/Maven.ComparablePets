package io.zipcoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Application {


    private int numberOfPets = 0;
    private ArrayList<String> typeOfPet = new ArrayList<String>();
    private ArrayList<String> nameOfPet = new ArrayList<String>();
    private ArrayList<Pets> allPets = new ArrayList<Pets>();

    private HashMap<String, String> allPetCollection = new HashMap<String, String>();

    Scanner userInput = new Scanner(System.in);


    public void getPetInfo() {
        System.out.println("Hey fool!  How many pets do you have?");
        numberOfPets = userInput.nextInt();
        userInput.nextLine();

        if (numberOfPets > 0) {
            for (int i = 0; i < numberOfPets; i++) {
                String name;
                String type;
                System.out.println("What type of pet is pet #: " + (i +1) + "?\n Only enter Dog, Cat or Snake");
                type = userInput.nextLine();
                System.out.println("What is your " + type + "'s name?");
                name = userInput.nextLine();

                this.allPets.add(PetFactory.createPet(type,name));
            }
        } else getPetInfo();

    }

    public void buildPetMap (ArrayList<String> typeOfPet, ArrayList<String> name) {
        for (int i = 0; i < typeOfPet.size(); i++) {
            allPetCollection.put(typeOfPet.get(i), nameOfPet.get(i));
        }
    }

    public String getPetFromMap(String key){
        return this.allPetCollection.get(key);
    }


    public void setNumberOfPets() {
        this.numberOfPets =numberOfPets;
    }

    public Integer getNumberOfPets() {
        return this.numberOfPets;
    }



    public static void main(String[] args) {

        Application app = new Application();
        app.getPetInfo();
    }




}

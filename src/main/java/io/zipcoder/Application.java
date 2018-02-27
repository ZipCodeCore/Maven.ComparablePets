package io.zipcoder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Application {

    private int numberOfPetsOwned;
    private Scanner userInput= new Scanner(System.in);
    private ArrayList<String> petName = new ArrayList<String>();
    private ArrayList<String> petType = new ArrayList<String>();
    private ArrayList<Pets> petCollector = new ArrayList<>();
    private HashMap<String, String> petList = new HashMap<String, String>();

    public static void main(String[] args) {
        Application app = new Application();
        app.numberOfPets();
        app.getPetCollection();


    }

    public Integer numberOfPets() {


        System.out.println("Where are my manners... Hello Human!! Its a pleasure to meet your" +
                " acquaintance.  Would you be so kind as to tell me how many pets do you own? " +
                "(please enter an integer greater than 0).");
        int tempCount = userInput.nextInt();
        userInput.nextLine();
            if (tempCount > 0) {
                numberOfPetsOwned = tempCount;
            } else {
                numberOfPets();
            }
        return numberOfPetsOwned;
    }

    public void getPetCollection() {

        for (int i = 0; i < numberOfPetsOwned; i ++) {

            String name;
            String type;

            System.out.println("What is the name of pet #" + (i+1) + " ?");
            name = userInput.nextLine();
            System.out.println("Please identify the type of pet (Dog, Cat or Snake)" + "that " + name + " is.");
            type = userInput.nextLine();
            this.petCollector.add(PetFactory.petCreator(type, name));
        }

    }
    public void petListBuilder(ArrayList<String> petType, ArrayList<String> petName) {
        for (int i = 0; i < petType.size(); i++) {
            petList.put(petType.get(i), petName.get(i));
        }
    }
    public String getPetFromList (String key) {
        return this.petList.get(key);
    }

}

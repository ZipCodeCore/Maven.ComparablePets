package io.zipcoder;


import io.zipcoder.pets.*;

import java.util.*;

public class Application {
   private Integer numberOfPets;
   private ArrayList<String> petTypes = new ArrayList<String>();
   private ArrayList<String> petNames = new ArrayList<String>();
   private HashMap<String,String> listOfPets = new HashMap<String,String>();
   private ArrayList<Pet> collectionOfPets = new ArrayList<Pet>();
   Scanner userInput = new Scanner(System.in);

   public void buildCollectionOfPets(){
       System.out.println("How many pets do you have?");
       this.setNumberOfPets(Integer.valueOf(userInput.nextLine()));
       for(int i = 0; i<this.getNumberOfPets(); i ++){
           String name;
           String type;
           System.out.println("What kind of pet is pet " + (i+1) +"?");
           type = userInput.nextLine();
           System.out.println("What is the name of that " + type + "?");
           name = userInput.nextLine();
           this.collectionOfPets.add(PetFactory.createPet(type,name));
       }
   }

   public void makePetsSpeak(){
       for(Pet p : collectionOfPets){
           System.out.println("Your " + p.getClass().getSimpleName() + " named " + p.getName() + " says " + p.speak());
       }
   }

    public static void main(String[] args) {
        Application main = new Application();
        main.buildCollectionOfPets();
        main.makePetsSpeak();
    }


   public void buildPetMap(ArrayList<String> type, ArrayList<String> name){
       for(int i = 0; i <type.size(); i ++){
           this.listOfPets.put(type.get(i),name.get(i));
       }

   }

   public String getPetFromMap(String key){

       return this.listOfPets.get(key);
   }

   public void setNumberOfPets(int numberOfPets){
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



}


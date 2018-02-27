package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;

import java.util.*;

public class PetInventory {

    protected HashMap<String,ArrayList<Pet>> pets;

    public PetInventory() {
        pets = new HashMap<String, ArrayList<Pet>>();

    }

    public void addPet(String type, String name){
//        if(hasEntry(type)){
//            if(type.equalsIgnoreCase("cat")){
//                Cat aCat =new Cat(name);
//                getArrayListForPets(type).add(aCat);
//            }else if(type.equalsIgnoreCase("dog")){
//                Dog aDog = new Dog(name);
//                getArrayListForPets(type).add(aDog);
//
//            }else if(type.equalsIgnoreCase("otter")){
//                Otter anOtter = new Otter(name);
//                getArrayListForPets(type).add(anOtter);
//
//            }
//
//        }else {
//            if(type.equalsIgnoreCase("cat")){
//                ArrayList<Pet>cats = new ArrayList<Pet>();
//                Cat aCat =new Cat(name);
//                cats.add(aCat);
//            }else if(type.equalsIgnoreCase("dog")){
//                ArrayList<Pet>dogs = new ArrayList<Pet>();
//                Dog aDog = new Dog(name);
//                dogs.add(aDog);
//
//            }else if(type.equalsIgnoreCase("otter")){
//                ArrayList<Pet>otters = new ArrayList<Pet>();
//                Otter anOtter = new Otter(name);
//                otters.add(anOtter);
//
//            }
//
//        }


    }

    public void removePet(String petName){
        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size(); i++)
                if (entry.getValue().get(i).getName().equalsIgnoreCase(petName)) {
                    entry.getValue().remove(i);
                }
        }


    }

    public String listPets(){
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size()-1; i++){
                builder.append(entry.getValue().get(i).getName()+ " says " + entry.getValue().get(i).speak() + "\n");

                }
        }

        return builder.toString();
    }

    public String getPetType(String name){
        for (String keys : pets.keySet()) {
            for (int i = 0; i < getArrayListForPets(keys).size(); i++) {
                if (getArrayListForPets(keys).get(i).getName().equalsIgnoreCase(name))
                    return keys;
            }
        }
        return null;

    }

    public ArrayList<String> listOfPetsByName() {
        ArrayList<String> petNames = new ArrayList<String>();
        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size()+1; i++) {
                petNames.add(entry.getValue().get(i).getName());
            }
        }
        return petNames;
    }

    public ArrayList<String> listOfPetsByTypeSorted(){
        ArrayList<String> petNames = new ArrayList<String>();
        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size(); i++) {
                petNames.add(entry.getValue().get(i).getName());
            }

        }

        return petNames;
    }

    public boolean hasEntry(String petType){
        if(pets.containsKey(petType)){
            return true;
        }
        return false;
    }
    public ArrayList<Pet> getArrayListForPets(String petType){
        return pets.get(petType);
    }



}

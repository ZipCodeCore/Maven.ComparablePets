package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetInventory {

    HashMap<String, ArrayList<Pet>> pets;

    public PetInventory() {
        this.pets = new HashMap<String, ArrayList<Pet>>();

    }


    public void addPet(String petType, String petName) {
        int petTypeInt;

        if (petType.equalsIgnoreCase("cat")) {
            petTypeInt = 1;
        } else if (petType.equalsIgnoreCase("dog")) {
            petTypeInt = 2;
        } else {
            petTypeInt = 3;
        }

        switch (petTypeInt) {
            case 1:
                Cat newCat = new Cat(petName);
                if (pets.containsKey(petType)) {
                    pets.get(petType).add(newCat);
                } else {
                    ArrayList<Pet> newCatList = new ArrayList<Pet>();
                    newCatList.add(newCat);
                    pets.put(petType, newCatList);
                }
                break;
            case 2:
                Dog newDog = new Dog(petName);
                if (pets.containsKey(petType)) {
                    pets.get(petType).add(newDog);
                } else {
                    ArrayList<Pet> newDogList = new ArrayList<Pet>();
                    newDogList.add(newDog);
                    pets.put(petType, newDogList);
                }
                break;
            case 3:
                Otter newOtter = new Otter(petName);
                if (pets.containsKey(petType)) {
                    pets.get(petType).add(newOtter);
                } else {
                    ArrayList<Pet> newOtterList = new ArrayList<Pet>();
                    newOtterList.add(newOtter);
                    pets.put(petType, newOtterList);
                }
                break;
        }

    }

    public void removePet(String petName) {

        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size(); i++) {
                if (entry.getValue().get(i).getName().equalsIgnoreCase(petName)) {
                    entry.getValue().remove(i);
                }
            }
        }
    }


    public String getPetType(String petName) {

        for (String key : pets.keySet()) {
            for (int i = 0; i < getPetsByType(key).size(); i++) {
                if (getPetsByType(key).get(i).getName().equalsIgnoreCase(petName)) {
                    return key;
                }
            }
        } return null;
    }

    public String listPetsAndSpeak() {

        String list = "";
        Set<String> keys = pets.keySet();
        for (String i : keys) {
            for (int j = 0; j < pets.get(i).size(); j++)
                list += pets.get(i).get(j).getName() + "==>" + pets.get(i).get(j).speak() + "\n";
        }
        return list;

    }

    public ArrayList<String> listOfPetsByName() {
        return null;
    }

    public ArrayList<Pet> getPetsByType(String petType) {
        return pets.get(petType);
    }


}

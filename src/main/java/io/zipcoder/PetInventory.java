package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;

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
                if (pets.containsKey("cat")) {
                    pets.get("cat").add(newCat);
                } else {
                    ArrayList<Pet> newCatList = new ArrayList<Pet>();
                    newCatList.add(newCat);
                    pets.put("cat", newCatList);
                }
                break;
            case 2:
                Dog newDog = new Dog(petName);
                if (pets.containsKey("dog")) {
                    pets.get("dog").add(newDog);
                } else {
                    ArrayList<Pet> newDogList = new ArrayList<Pet>();
                    newDogList.add(newDog);
                    pets.put("dog", newDogList);
                }
                break;
            case 3:
                Otter newOtter = new Otter(petName);
                if (pets.containsKey("otter")) {
                    pets.get("otter").add(newOtter);
                } else {
                    ArrayList<Pet> newOtterList = new ArrayList<Pet>();
                    newOtterList.add(newOtter);
                    pets.put("otter", newOtterList);
                }
                break;
        }

    }

    public void removePet(String petName) {

        for (Map.Entry<String, ArrayList<Pet>> entry : pets.entrySet()) {
            for (int i = 0; i < pets.entrySet().size(); i++)
            if (entry.getValue().get(i).getName().equalsIgnoreCase(petName)) {
                entry.getValue().remove(i);
            }
        }
    }

    public String listPets() {

        String list = "";
        Set<String> keys = pets.keySet();
        for (String i : keys) {
            for (int j = 0; j < pets.get(i).size(); j++)
            list += pets.get(i).get(j).getName() + "==>" + pets.get(i).get(j).speak() + "\n";
        }
        return list;

    }

    public String getPetType(String petName) {
        return null;
    }

    public ArrayList<String> listOfPetsByName() {
        return null;
    }



}

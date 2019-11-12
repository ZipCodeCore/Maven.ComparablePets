package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Horse;
import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    List<Pet> petList = new ArrayList<Pet>();
    Console menu = new Console(System.in, System.out);

    public void runApp() {

        int numberOfPets;

        numberOfPets = this.menu.getIntegerInput("How many pets do you have?");

        for (int i = 0; i < numberOfPets; i++) {
            String petType = "";
            String petName = "";
            petType = this.menu.getStringInput("What type is pet: " + (i+1) + "?");
            addPet(petType);
            petName = this.menu.getStringInput("What is the pet name?");
            this.petList.get(i).setName(petName);
        }

        printPets();


    }

    public void addPet(String petType){
        petType = petType.toLowerCase();
        if (petType.equals("cat")) this.petList.add(new Cat());
        if (petType.equals("dog")) this.petList.add(new Dog());
        if (petType.equals("horse")) this.petList.add(new Horse());
    }

    public void printPets(){
        int i = 0;
        for (Pet eachPet : this.petList){
            String petInfo = "";
            petInfo = petInfo.concat(this.petList.get(i).getPetType().concat(": " + this.petList.get(i).getName()));
            petInfo = petInfo.concat(" - " + this.petList.get(i).speak());
            this.menu.println(petInfo);
            i++;
        }
    }
}

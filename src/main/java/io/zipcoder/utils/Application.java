package io.zipcoder.utils;

import io.zipcoder.Console;
import io.zipcoder.pets.Pets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 11/6/17.
 */
public class Application {
    public static void main(String[] args) {
        petApp();
    }
    public static void petApp() {
        Integer numofPets = getNumOfPets();
        Console.println("TELL ME MORE... \n", numofPets);

        String[] petTypes = new String[numofPets];
        String[] petNames = new String[numofPets];
        for(int i = 0; i < numofPets; i++){
            petNames[i] = Console.getStringInput(String.format("Tell me the name of pet %s ...\n", i+1));
            petTypes[i] = Console.getStringInput(String.format("Ooh... what KIND of pet is %s ... \n", petNames[i]));
        }
        PetLodge cozy = new PetLodge(numofPets, petNames, petTypes);
        cozy.displayPetInfo();
    }

    protected static Integer getNumOfPets() {
        return Console.getIntegerInput("I'm Kai! I have a cat named Boots. How many pets do you have?\n");
    }


}

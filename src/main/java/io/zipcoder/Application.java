package io.zipcoder;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Application {
    List<Pet> listOfPets = new ArrayList<Pet>();
    List<String> petNames = new ArrayList<String>();
    List<String> petTypes = new ArrayList<String>();

    HashMap<String, String> petLists = new HashMap<String, String>();

    Integer numOfPets;


    public Application(){
        numOfPets = 0;
    }



    public void setNumOfPets(Integer numOfPets){
        this.numOfPets = numOfPets;
    }

    public Integer getNumOfPets() {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many pets do you have?");
        Integer numOfPets = sc.nextInt();
        sc.nextLine();
        return numOfPets;
    }




    public void setPetTypes(List<String> petTypes){
        this.petTypes = petTypes;
    }

    public String getPetType() {
        String typeOfPet = null;
        for (Integer i = 0; i < numOfPets; i++) {
            System.out.println("For each pet, what kind of pet is it?");
            Scanner sc1 = new Scanner(System.in);
            typeOfPet = sc1.nextLine();
            petTypes.add(typeOfPet);


        }
        return petTypes.toString();
    }




    public void setPetNames(List<String> petNames){
        this.petNames = petNames;
    }

    public String getPetName() {
        String nameOfPet = null;
        for (Integer i = 0; i < numOfPets; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("What's the name of your pet?");
            nameOfPet = sc2.nextLine();
            petNames.add(nameOfPet);
        }
        return petNames.toString();
    }


//TODO finish scoping out view Pet List and create Tests.
    public void getviewPetList(List<String> petTypes, List<String> petNames){

            for (Integer i = 0; i <petTypes.size(); i++){
                petLists.put(petTypes.get(i), petNames.get(i));
        }

    }

}



//Originally I had a big function in the middle of Application but I remembered that I don't want face cake.
//Attempting to break it down into smaller pieces so that I can see the whole thing. So far no red.


package io.zipcoder;


import java.util.*;

//April
/**
 * Tests made by Frankie Rodriguez on 02/26/18
 */

public class Application {
    private String nameOfPet;
    private String typeOfPet;
    private Integer amountOfPets;


    ArrayList<Pet> petList = new ArrayList<>();

    public Application() {
    }

    public Application(String typeOfPet, String nameOfPet) {
        this.typeOfPet = typeOfPet;
        this.nameOfPet = nameOfPet;
    }

    public void welcomeUser() {
        System.out.println("******************** WELCOME PET OWNER **********************\n" +
                "We will be asking you a couple of questions about your pets.\n" +
                "No need to worry. We won't be doing anything sketchy with\n" +
                "this info. Your pet info is safe with us :)    \n");
    }

    public String getNameOfPet() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is it's name?");
        return input.nextLine();
    }

    public String getTypeOfPet() {
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of pet is it?");
        return input.nextLine();
    }

    public Integer howManyPetsYouGotDamn() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?\n\nEnter the amount of pets: ");
        return input.nextInt();

    }

    public ArrayList<Pet> fillList(String nameOfPet, String typeOfPet) {
        petList.add(new Pet());
        return petList;
    }


    public static ArrayList<Pet> sortList(ArrayList<Pet> petList) {
        Collections.sort(petList, (Pet petOne, Pet petTwo)-> petOne.getName().compareTo(petTwo.getName()));
        return petList;

    }



}



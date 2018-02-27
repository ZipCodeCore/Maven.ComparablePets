package io.zipcoder;

import com.sun.javafx.tools.packager.JarSignature;

import javax.xml.crypto.Data;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setIn;


/**
 * Tests made by Frankie Rodriguez on 02/26/18
 */

public class Application {
    private String nameOfPet;
    private String typeOfPet;
    private Integer amountOfPets;

    Scanner scanner = new Scanner(in);


    ArrayList<Object> petList = new ArrayList<Object>();

    public Application() {
    }
    public Application(String typeOfPet, String nameOfPet){
        this.typeOfPet = typeOfPet;
        this.nameOfPet = nameOfPet;
    }

    public void welcomeUser(){
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
        System.out.println("How many pets do you have?\n\nEnter the amount of pets: ");
//        int amountOfPets = scanner.nextInt();
        return amountOfPets;
    }
    public void addPetInfoToList(){

    }
    public ArrayList<Object> fillList(String typeOfPet, String nameOfPet){
        petList.add(new Application(typeOfPet, nameOfPet));
        return petList;
    }
//    public ArrayList<Object> sortList(ArrayList<Object> petList) {
//        Object pets= null;
//        for (Object pets : petList) {
//            System.out.println(pets);
//        }
//        return null;
//    }

}

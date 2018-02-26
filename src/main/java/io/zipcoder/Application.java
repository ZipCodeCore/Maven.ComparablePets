package io.zipcoder;
import java.util.ArrayList;
import java.util.Scanner;


public class Application {


    private int numberOfPets = 0;
    private String typeOfPet;
    private String nameOfPet;
    private ArrayList<Integer> allPets;

    Scanner userInput = new Scanner(System.in);


    public void getPetInfo() {
        System.out.println("How many pets do you have?");
        numberOfPets = userInput.nextInt();


    }






}

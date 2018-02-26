package io.zipcoder;


import java.util.Scanner;

public class Application {

    public static Scanner scan = new Scanner(System.in);
    Integer numberOfPets;
    String petName;
    String petType;



    public static void main(String[] args) {
        Application app = new Application();
        System.out.println("Hey Mr. Green Maker how many pets do you have?");
        app.numberOfPets = scan.nextInt();
        scan.nextLine();
        System.out.println("");

    }
    public String getPetName(){
        return null;
    }
    public String getPetType(){
        return null;
    }
    public int getNumberOfPets(){
        return 0;
    }

    public void setPetName(String name){
        this.petName=name;
    }
    public void setPetType(String type){
        this.petType=type;
    }
    public void setNumberOfPets(int numberOfPets){
        this.numberOfPets= numberOfPets;
    }



}

package io.zipcoder;


import java.util.Scanner;

public class Application {

    public static Scanner scan = new Scanner(System.in);
    public String input="";
    private Integer numberOfPets;
    private String petName;
    private String petType;
    PetInventory inventory = new PetInventory();

    public static void main(String[] args) {
        Application app = new Application();
        System.out.println("Hey Mr. Green Maker how many pets do you have?");
        app.numberOfPets = scan.nextInt();
        scan.nextLine();
        //app.setTotalNumberOfPets(nu);
        app.PetApplication();
    }
    public void setTotalNumberOfPets(int numberOfPets){
        this.numberOfPets = numberOfPets;
    }
    public int getTotalNumberOfPets(){
        return numberOfPets;
    }
    public void PetApplication(){

        PetInventory inventory = new PetInventory();
        for(int i =0;i<getTotalNumberOfPets();i++){
            String petType="";
            String name ="";
            System.out.println("What is the type of your first Pet ");
            petType+=scan.nextLine();
            System.out.println("What is its name");
            name+=scan.nextLine();

            inventory.addPet(petType,name);
        }

        System.out.println(inventory.listnamesOrdered());
    }


}

package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public ArrayList<Pet> collectionOfPets = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public void userDataOfPets(){
        System.out.println("How many pets do you have?");
        int numberOfPets = (Integer.valueOf(scan.nextLine()));
        for (int i = 0; i < numberOfPets; i++){
            String name;
            String petType;
            System.out.println("What is the name of pet " + (i +1) +" ?");
            name = scan.nextLine();
            System.out.println("What kind of pet is it "+ (i +1) +" ?");
            petType = scan.nextLine();
            addPet(name, petType);

        }
    }
    public void addPet(String petName, String petType) {
        Pet pet = null;
        if (petType.equalsIgnoreCase("Dog")) {
            collectionOfPets.add(new Dog(petName));

        } else if (petType.equalsIgnoreCase("Cat")) {
            collectionOfPets.add(new Cat(petName));
        } else if (petType.equalsIgnoreCase("Unicorn")) {
            collectionOfPets.add(new Unicorn(petName));
        } else {
            pet = null;
        }

    }
        public String printList() {
            StringBuilder sb = new StringBuilder();
            for (Pet pet : collectionOfPets) {
                sb.append(pet.getName());
                sb.append(" ");
                        sb.append(pet.getClass().getSimpleName());
                sb.append(", ");

            }
            return String.valueOf(sb);
        }



    public static void main(String[] args) {
        Application application = new Application();
        application.userDataOfPets();
        application.printList();
    }
}

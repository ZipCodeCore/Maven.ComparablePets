package io.zipcoder;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Cow;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public Scanner input = new Scanner(System.in);
    public ArrayList<Pet> petList = new ArrayList<>();

    public int askForPetNumber() {
        System.out.println("How many pets do you have? ");
        return getUserInputInt();
    }

    public void askForPetName() {
        String[] petNames = new String[askForPetNumber()];
        String name;
        for(int i = 0; i < petNames.length; i++) {
            System.out.println("What is pet " + (i + 1) + "'s name? ");
            name = getUserInputString();
            petNames[i] = name;
        }
        askForPetTypes(petNames);
    }

    public void askForPetTypes(String[] petNames) {
        for(int i = 0; i < petNames.length; i++) {
            String type;
            boolean correctType = true;
            do {
                System.out.println("Is " + petNames[i] + " a Dog, Cat, or Cow?");
                type = getUserInputString();
                if(type.equals("Dog") || type.equals("Cat") || type.equals("Cow")){
                    correctType = false;
                }
            } while (correctType);
            createPet(type, petNames[i]);
        }
    }

    public void printPetList() {
        for (Pet pet : petList) {
            System.out.println(pet.getName() + " " + pet.speak());
        }
    }

    public void createPet(String type, String name) {
        Pet p;
        switch (type) {
            case "Dog":
                p = new Dog();
                p.setName(name);
                petList.add(p);
                break;
            case "Cat":
                p = new Cat();
                p.setName(name);
                petList.add(p);
                break;
            case "Cow":
                p = new Cow();
                p.setName(name);
                petList.add(p);
                break;
        }
    }

    public ArrayList<Pet> getPetList() {
        return this.petList;
    }

    public String getUserInputString() {
        return input.nextLine();
    }

    public int getUserInputInt() {
        return Integer.parseInt(input.nextLine());
    }

}

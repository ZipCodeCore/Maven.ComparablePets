package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Edited by Frankie
 */

public class Application implements Comparator<Pet> {
    Integer petCount;
    String petType;
    String petName;
    ArrayList<Pet> pets = new ArrayList<Pet>();
    Pet p;
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    public void run() {
        String welcome = welcomeMessage();
        System.out.println(welcome + "\nHow many pets do you have?\n");
        int petCount = input.nextInt();
        setNumberOfPets(petCount);
        System.out.println("Now lets get to know them.\n");
        for (int i = 1; i <= petCount; i++) {
            System.out.println("Please enter the type of pet #" + i + ": ");
            String petType = input1.nextLine();
            System.out.println("Please enter the name of pet #" + i + ": ");
            String petName = input2.nextLine();
            addPet(petType, petName);
        }

        System.out.println("Your pets...\n");
        System.out.println(listPetsSorted());
    }

    public String welcomeMessage() {
        return "Welcome interesting person whom I've never met. Please tell me some things about yourself.";
    }

    public void setNumberOfPets(int petCount) {
        this.petCount = petCount;
    }

    public int getNumberOfPets() {
        return this.petCount;
    }

    public void setTypeOfPet(String petType) {
        this.petType = petType;
    }

    public String getTypeOfPet() {
        return this.petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return this.petName;
    }

    public void addPet(String petType, String petName) {
        if (petType.equals("Dog")) {
            this.p = new Dog(petName);
        } else if (petType.equals("Cat")) {
            this.p = new Cat(petName);
        } else if (petType.equals("Bird")) {
            this.p = new Bird(petName);
        }
        this.pets.add(p);
    }

    public boolean getApplication(String petType) {
        String listMF = listPetsSorted();
        CharSequence petTy = petType;
        return listMF.contains(petTy);
    }

    public String listPetsSorted() {
        Pet[] temp = pets.toArray(new Pet[pets.size()]);
        pets.clear();
        Arrays.sort(temp, sortPets);
        StringBuilder printOut = new StringBuilder();
        for (Pet pet : temp) {
            printOut.append(String.format("%s : %s\n", pet.getType(), pet.getPetName()));
        }
        return printOut.toString();
    }

    public Comparator<Pet> sortPets = new Comparator<Pet>() {
        public int compare(Pet o1, Pet o2) {

            int nameCounter = (o1.getPetName().length() > o2.getPetName().length() ? o1.getPetName().length() : o2.getPetName().length());
            for (int i = 0; i < nameCounter; i++) {
                if (o1.getPetName().charAt(i) < o2.getPetName().charAt(i)) {
                    return 1;
                } else if (o1.getPetName().charAt(i) > o2.getPetName().charAt(i)) {
                    return -1;
                }
            }
            return 0;
        }
    };

    public int compare(Pet p1, Pet p2) {
        int nameCounter = (p1.getPetName().length() > p2.getPetName().length() ? p1.getPetName().length() : p2.getPetName().length());
        for (int i = 0; i < nameCounter; i++) {
            if (p1.getPetName().charAt(i) < p2.getPetName().charAt(i)) {
                return 1;
            } else if (p1.getPetName().charAt(i) > p2.getPetName().charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}

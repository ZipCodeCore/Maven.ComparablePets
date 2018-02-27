package io.zipcoder;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        HashMap<String, String> petMap = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have ?");
        int numberOfpets =scan.nextInt();
        scan.nextLine();

        //going through the loop and setting it equal to number of pets.
        for (int i =0; i <numberOfpets; i++){
            System.out.println("What kind of pet do you have ?");
            //waits for input to be entered before continuing on to the next line.
            String pet = scan.nextLine();
            System.out.println("What is the name of your pet?");
            String petName = scan.nextLine();
            petMap.put(pet,petName);

        }
        //.keySet() returns all the keys in the hashmap, (petMap)

        for (String i : petMap.keySet()){
            System.out.printf("This pet is a %s named %s%n", i,petMap.get(i));
        }


    }
}
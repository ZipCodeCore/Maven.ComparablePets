package io.zipcoder.pets;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Application app = new Application();
        ArrayList<Pets> pets = app.createPetList();
        String petString = app.toString();
        System.out.println(petString);
    }
}

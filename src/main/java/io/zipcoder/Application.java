package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {

        ArrayList<Pet> list = new ArrayList<Pet>();
            
        list.add(new Dog("Toby"));
        list.add(new Cat("Guzazo"));
        list.add(new Parrot("Corillo"));

        Collections.sort(list);

        for (Pet e : list) {
            System.out.println(e);

        }

    }
}

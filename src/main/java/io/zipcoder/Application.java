package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {

        ArrayList<Pet> list = new ArrayList<Pet>();

        list.add(new Dog("Bolo"));
        list.add(new Cat("Aldi"));
        list.add(new Parrot("Creed"));

        Collections.sort(list);

        for (Pet e : list) {
            System.out.println(e);

        }

    }
}

package io.zipcoder.pets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {
@Test
    public void sortingTesComparable(){

    ArrayList<Pets> userPets = new ArrayList<Pets>();

    userPets.add(new Fish("joe"));
    userPets.add(new Dog("joe"));
    userPets.add(new Cat("joe"));
    userPets.add(new Cat("zebra"));

    for (Pets pets : userPets) {
        System.out.println(pets.getNames() + " goes " + pets.getClass().getName());
    }

    System.out.println("\n");

    Collections.sort(userPets);

    for (Pets pets : userPets) {
        System.out.println(pets.getNames() + " goes " + pets.getClass().getName());
    }

}

    @Test
    public void sortingTestComparator(){

        ArrayList<Pets> userPets = new ArrayList<Pets>();

        userPets.add(new Fish("joe"));
        userPets.add(new Dog("joe"));
        userPets.add(new Cat("joe"));
        userPets.add(new Cat("zabra"));

        for (Pets pets : userPets) {
            System.out.println(pets.getNames() + " goes " + pets.getClass().getName());
        }

        System.out.println("\n");

        Collections.sort(userPets, new TypeCompare());

        for (Pets pets : userPets) {
            System.out.println(pets.getNames() + " goes " + pets.getClass().getName());
        }

    }
}
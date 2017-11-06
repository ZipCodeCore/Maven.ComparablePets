package io.zipcoder.pets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class MainTest {
@Test
    public void sortingTest(){

    ArrayList<Pets> userPets = new ArrayList<Pets>();

    userPets.add(new Fish("joe"));
    userPets.add(new Dog("joe"));
    userPets.add(new Cat("joe"));
    userPets.add(new Cat("zebra"));

    for (Pets pets : userPets) {
        System.out.println(pets.getName() + " goes " + pets.getClass().getName());
    }

    System.out.println("\n");

    Collections.sort(userPets);

    for (Pets pets : userPets) {
        System.out.println(pets.getName() + " goes " + pets.getClass().getName());
    }

}
}
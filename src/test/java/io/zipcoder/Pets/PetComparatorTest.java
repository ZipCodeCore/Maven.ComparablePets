package io.zipcoder.Pets;

import io.zipcoder.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetComparatorTest {

    @Test
    public void petComparatorTest(){
        Application testApp = new Application();
        PetComparator petComparator = new PetComparator();

        List<Pet> pets = new ArrayList<Pet>();
        Cat cat1 = new Cat("Apple");
        Dog dog2 = new Dog("Sally");
        Dog dog1 = new Dog("Bob");
        Racoon racoon1 = new Racoon("Max");
        pets.add(cat1);
        pets.add(dog2);
        pets.add(dog1);
        pets.add(racoon1);

        Collections.sort(pets, petComparator);

        String expected = "Apple: Meow\n" +
                "Bob: Woof\n" +
                "Sally: Woof\n" +
                "Max: Screeeeeeeech!\n";
        String actual = testApp.showPetList(pets);

        Assert.assertEquals(expected, actual);
    }
}

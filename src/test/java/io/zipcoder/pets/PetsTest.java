package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PetsTest {

    @Test
    public void testConstructor() {
        Pets pet = new Pets("Sandy");
        String expected = "Sandy";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Pets pet = new Pets("Sudafed");
        String expected = "Sudafed";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo(){
        //Given
        Pets dog = new Dog("Sandy");
        Pets dog1 = new Dog("Molly");
        Pets cat = new Cat("Sandy");
        Pets cat1 = new Cat("Andy");
        Pets parrot = new Parrot("Id");
        ArrayList<Pets> pets = new ArrayList<Pets>(Arrays.asList(dog, dog1, cat, cat1, parrot));
        ArrayList<Pets> expected = new ArrayList<Pets>(Arrays.asList(cat1, parrot, dog1, cat, dog));
        //When
        Collections.sort(pets);
        //Then
        ArrayList<Pets> actual = pets;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPetsComparator() {
        //Given
        Pets dog1 = new Dog("Sandy");
        Pets dog2 = new Dog("Molly");
        Pets dog3 = new Dog("Ally");
        Pets cat = new Cat("Sandy");
        Pets cat1 = new Cat("Andy");
        Pets parrot = new Parrot("Id");
        ArrayList<Pets> pets = new ArrayList<Pets>(Arrays.asList(dog1, dog2, dog3, cat, cat1, parrot));
        ArrayList<Pets> expected = new ArrayList<Pets>(Arrays.asList(cat1, cat, dog3, dog2, dog1, parrot));
        //When
        Collections.sort(pets);
        //Then
        ArrayList<Pets> actual = pets;
        Assert.assertEquals(expected, actual);
    }

}

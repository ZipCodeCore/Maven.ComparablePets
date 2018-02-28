package io.zipcoder;

import io.zipcoder.pets.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class PetInventoryTest {

    PetInventory petListTest;

    @Before
    public void setup() {
        petListTest = new PetInventory();
    }

    @Test
    public void addPetTest() {
        Dog myDog = new Dog( "Fighter");
        ArrayList<Pet> arrayListOfDogsTest = new ArrayList<Pet>();
        arrayListOfDogsTest.add(myDog);
        petListTest.pets.put("dog", arrayListOfDogsTest);
        petListTest.addPet("dog", "Sparky");
        int expected = 2;
        int actual = petListTest.pets.get("dog").size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPetTest2() {
        petListTest.addPet("cat", "first");
        petListTest.addPet("cat", "second");
        petListTest.addPet("cat", "third");
        String expected = "second";
        String actual = petListTest.pets.get("cat").get(1).getName();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removePetTest1() {
        petListTest.addPet("otter", "Fire");
        petListTest.addPet("otter", "Fury");
        petListTest.removePet("Fire");
        int expected = 1;
        int actual = petListTest.pets.get("otter").size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void listPetsAndSpeak() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Otty");

        String expected = "Zina==>Meow!\n" +
                "Otty==>Muahaha\n";

        String actual = petListTest.listPetsAndSpeak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPetType() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Otty");
        petListTest.addPet("cat", "Tissue");

        String expected = "cat";
        String actual = petListTest.getPetType("Zina");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPetsByTypeTest() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Otty");
        petListTest.addPet("cat", "Tissue");
        String expected = "Tissue";
        String actual = petListTest.getPetsByType("cat").get(1).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllPetsTest() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Felix");
        petListTest.addPet("dog", "Arnold");
        petListTest.addPet("otter", "Clubber");
        petListTest.addPet("cat", "Felix");
        String expected = "Clubber";
        String actual = petListTest.getAllPets().get(4).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPetsByNameTest() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Felix");
        petListTest.addPet("dog", "Arnold");
        petListTest.addPet("otter", "Clubber");
        petListTest.addPet("cat", "Felix");
        // from: Zina, Felix(cat), Arnold, Felix (otter), Clubber
        // to: Arnold, Clubber, Felix (cat), Felix (otter), Zina
        String expected = "Meow!";
        String actual = petListTest.sortedPetsByName().get(2).speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPetsByTypeTest1() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Felix");
        petListTest.addPet("dog", "Arnold");
        petListTest.addPet("otter", "Clubber");
        petListTest.addPet("cat", "Felix");
        // from: Zina, Felix (cat), Arnold, Felix (otter), Clubber
        // to: Felix (cat), Zina, Arnold, Clubber, Felix (otter)

        String expected = "Clubber";
        String actual = petListTest.sortedPetsByType().get(3).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPetsByTypeTest2() {
        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Felix");
        petListTest.addPet("dog", "Arnold");
        petListTest.addPet("otter", "Clubber");
        petListTest.addPet("cat", "Felix");
        // from: Zina, Felix (cat), Arnold, Felix (otter), Clubber
        // to: Felix (cat), Zina, Arnold, Clubber, Felix (otter)

        String expected = "Zina";
        String actual = petListTest.sortedPetsByType().get(1).getName();
        Assert.assertEquals(expected, actual);
    }
}

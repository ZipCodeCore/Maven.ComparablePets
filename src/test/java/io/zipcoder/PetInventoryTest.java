package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public void listOfPetsByNameTest() {
        Dog myDog = new Dog("Fighter");
        ArrayList<Pet> arrayListOfDogsTest = new ArrayList<Pet>();
        arrayListOfDogsTest.add(myDog);
        Cat myCat = new Cat("Zina");
        Otter myOtter = new Otter("Otty");
        ArrayList<Pet> catsTest = new ArrayList<Pet>();
        ArrayList<Pet> otterTest = new ArrayList<Pet>();
        catsTest.add(myCat);
        otterTest.add(myOtter);

        petListTest.pets.put("Cat", catsTest);
        petListTest.pets.put("Otty", otterTest);
        petListTest.pets.put("Dog", arrayListOfDogsTest);

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Fighter");
        expected.add("Otty");
        expected.add("Zina");

        ArrayList<String> actual = petListTest.listOfPetsByName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listOfPetsByTypeTest() {



    }
}

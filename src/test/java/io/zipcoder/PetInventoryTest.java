package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PetInventoryTest {

    PetInventory testInventory;


    @Before
    public void setup() {
        testInventory = new PetInventory();
    }


    @Test
    public void addPetTest1() {
        String petType = "cat";
        Cat testCat = new Cat("Winston");
        ArrayList<Pet> testList = new ArrayList<Pet>();
        testList.add(testCat);
        testInventory.addPet(petType, testCat.getName());
        String expected = "Winston";
        String actual = testInventory.pets.get(petType).get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePetTest() {
        String petType = "dog";
        ArrayList<Pet> testList = new ArrayList<Pet>();
        Dog marky = new Dog("Marky");
        Dog ricky = new Dog("Ricky");
        testList.add(marky);
        testList.add(ricky);
        testInventory.pets.put(petType, testList);
        testInventory.removePet("Marky");
        String expected = "Ricky";
        String actual = testInventory.pets.get(petType).get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listPetsTest() {
        String petType1 = "otter";
        Otter testOtter = new Otter("Oliver");
        ArrayList<Pet> otterList = new ArrayList<Pet>();
        otterList.add(testOtter);
        String petType2 = "dog";
        Dog testDog = new Dog("Dasher");
        ArrayList<Pet> dogList = new ArrayList<Pet>();
        dogList.add(testDog);
        testInventory.pets.put(petType1, otterList);
        testInventory.pets.put(petType2, dogList);
        String actual = testInventory.listPets();
        String expected = "Oliver says Muahaha\nDasher says Woof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPetTypeTest() {
        String petType = "dog";
        ArrayList<Pet> testList = new ArrayList<Pet>();
        Dog marky = new Dog("Marky");
        Dog ricky = new Dog("Ricky");
        testList.add(marky);
        testList.add(ricky);
        testInventory.pets.put(petType, testList);
        String expected = "dog";
        String actual = testInventory.getPetType("Ricky");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listOfPetsByNameTest() {
        ArrayList<Pet> testList = new ArrayList<Pet>();
        Dog ricky = new Dog("Ricky");
        Dog marky = new Dog("Marky");
        testList.add(ricky);
        testList.add(marky);
        testInventory.pets.put("dog", testList);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Marky");
        expected.add("Ricky");
        ArrayList<String> actual = testInventory.listOfPetsByName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listOfPetsByTypeTest() {
        ArrayList<Pet> testList1 = new ArrayList<Pet>();
        Dog ricky = new Dog("Ricky");
        Dog marky = new Dog("Marky");
        testList1.add(ricky);
        testList1.add(marky);
        testInventory.pets.put("dog", testList1);
        ArrayList<Pet> testList2 = new ArrayList<Pet>();
        Otter oliver = new Otter("Oliver");
        testList2.add(oliver);
        testInventory.pets.put("otter", testList2);
        ArrayList<Pet> testList3 = new ArrayList<Pet>();
        Cat zeus = new Cat("Zeus");
        testList3.add(zeus);
        testInventory.pets.put("charlie", testList3);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Zeus");
        expected.add("Marky");
        expected.add("Ricky");
        expected.add("Oliver");
        ArrayList<String> actual = testInventory.listOfPetsByType();
        Assert.assertEquals(expected, actual);
    }

}

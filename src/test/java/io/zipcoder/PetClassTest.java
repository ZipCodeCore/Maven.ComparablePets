package io.zipcoder;


import org.junit.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetClassTest {


    @Test
    public void testConstructorPetName() {
        // Given
        String expected = "Spot";

        // When
        Pet testPet = new Pet(expected);

        // Then
        String actual = testPet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Pet petTest = new Pet();
        String expected = "Moe";
        //When
        petTest.setName(expected);
        String actual = petTest.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Pet petTest = new Pet();
        String expected = "noise!";
        //When
        String actual = petTest.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareTest(){
        PetOwner petowner = new PetOwner();
        AnimalComparator animalComparator = new AnimalComparator();

        ArrayList<Pet> petList = new ArrayList<Pet>();
        Cat testCat = new Cat("Fluffy");
        Dog testDog = new Dog("Spot");
        Bird testBird = new Bird("Tweety");
        petList.add(testCat);
        petList.add(testDog);
        petList.add(testBird);

        Collections.sort(petList, animalComparator);

        String expected ="Tweety is a Bird\n" +
        "Fluffy is a Cat\n" +
        "Spot is a Dog\n";
        String actual = PetOwner.printList(petList);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void comparableTest(){
        PetOwner petowner = new PetOwner();


        ArrayList<Pet> petList = new ArrayList<Pet>();
        Cat testCat = new Cat("Fluffy");
        Dog testDog = new Dog("Spot");
        Bird testBird = new Bird("Tweety");
        petList.add(testCat);
        petList.add(testDog);
        petList.add(testBird);

        Collections.sort(petList);

        String expected ="Fluffy is a Cat\n" +
                "this pet says: Meow\n"+
                "Spot is a Dog\n" +
                "this pet says: Woof\n"+
                "Tweety is a Bird\n"+
                "this pet says: Chirp\n";
        String actual = PetOwner.printList(petList);

        Assert.assertEquals(expected, actual);

    }

}

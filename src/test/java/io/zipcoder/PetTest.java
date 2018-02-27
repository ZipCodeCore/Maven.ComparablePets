package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {
    @Test
    public void testSetPetName() {
        // Given
        Pet testPet = new Pet();
        String expected = "Spot";

        // When
        testPet.setPetName(expected);
        String actual = testPet.getPetName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorPetName() {
        // Given
        String expected = "Spot";

        // When
        Pet testPet = new Pet(expected);

        // Then
        String actual = testPet.getPetName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testspeak() {
        // Given
        String expected = "Generic Animal Sound";

        // When
        Pet testPet = new Pet();

        // Then
        String actual = testPet.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void compareToTest(){
        //Given
        PetOwner petOwner = new PetOwner();

        //When
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Cat catTest = new Cat("Maus");
        Dog dogTest = new Dog("Hemi");
        Bird birdTest = new Bird("Tera");
        petList.add(catTest);
        petList.add(dogTest);
        petList.add(birdTest);

        Collections.sort(petList);
        //Then
        String expected = "Hemi the Dog says Woof\n" + "Maus the Cat says Meow\n" + "Tera the Bird says Tweet Tweet\n";
        String actual = PetOwner.printPetList(petList);
        Assert.assertEquals(expected, actual);
    }
}
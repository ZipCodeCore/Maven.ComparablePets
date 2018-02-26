package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {

    @Test
    public void createDogTest() {
        //Given
        String name = "Hemi";
        String type = "Dog";
        //Then
        Pet testPet = PetFactory.createPet(name, type);
        //When
        Assert.assertEquals(testPet.getName(), "Hemi");
        Assert.assertTrue(testPet instanceof Dog);

    }

    @Test
    public void createCatTest() {
        //Given
        String name = "Maus";
        String type = "Cat";
        //Then
        Pet testPet = PetFactory.createPet(name, type);
        //When
        Assert.assertEquals(testPet.getName(), "Maus");
        Assert.assertTrue(testPet instanceof Cat);

    }

    @Test
    public void createBirdTest() {
        //Given
        String name = "Budgie";
        String type = "Bird";
        //Then
        Pet testPet = PetFactory.createPet(name, type);
        //When
        Assert.assertEquals(testPet.getName(), "Bird");
        Assert.assertTrue(testPet instanceof Cat);

    }
}

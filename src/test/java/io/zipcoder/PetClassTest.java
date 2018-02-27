package io.zipcoder;


import org.junit.Assert;

import org.junit.Test;

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
}

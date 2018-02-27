package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class BirdClassTest {
    @Test
    public void testConstructorPetName() {
        // Given
        String expected = "Budgie";

        // When
        Pet testPet = new Pet(expected);

        // Then
        String actual = testPet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Bird birdTest = new Bird();
        String expected = "Taillow";
        //When
        birdTest.setName(expected);
        String actual = birdTest.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Bird birdTest = new Bird();
        String expected = "Chirp";
        //When
        String actual = birdTest.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }
}

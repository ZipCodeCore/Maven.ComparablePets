package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogClassTest {
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
        Dog dogTest = new Dog();
        String expected = "Hemi";
        //Then
        dogTest.setName(expected);
        String actual = dogTest.getName();
        //When
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Dog dogTest = new Dog();
        String expected = "Woof";
        //Then
        String actual = dogTest.speak();
        //When
        Assert.assertEquals(expected, actual);
    }
}

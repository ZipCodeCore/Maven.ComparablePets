package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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

}
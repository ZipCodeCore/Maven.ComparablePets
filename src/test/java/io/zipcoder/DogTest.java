package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSetDogName() {
        // Given
        Dog testDog = new Dog();
        String expected = "Spot";

        // When
        testDog.setPetName(expected);
        String actual = testDog.getPetName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorDogName() {
        // Given
        String expected = "Spot";

        // When
        Dog testDog = new Dog(expected);

        // Then
        String actual = testDog.getPetName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testspeak() {
        // Given
        String expected = "Woof";

        // When
        Dog testDog = new Dog();

        // Then
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

}

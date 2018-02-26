package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {
    Pet testPet = new Pet();

    @Test
    public void getPetNameTest() {
        testPet.setName("Brian");
        String actual = testPet.getName();
        String expected = "Brian";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest() {
        String actual = testPet.speak();
        String expected = "I am a pet.";
        Assert.assertEquals(expected,actual);

    }
}


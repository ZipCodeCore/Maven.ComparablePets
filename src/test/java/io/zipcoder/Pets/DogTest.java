package io.zipcoder.Pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        Dog testDog = new Dog("Max");

        String expected = "Woof";
        String actual = testDog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Dog testDog = new Dog("Max");

        String expected = "Max";
        String actual = testDog.getName();

        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void getNamesOfDogs() {
        Dog dog = new Dog("Chance");
        String expected = "Chance";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Chance");
        String expected = "I'm such a wimp! I'm running from a cat!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}

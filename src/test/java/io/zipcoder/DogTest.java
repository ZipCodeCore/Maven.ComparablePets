package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class DogTest {

    @Test
    public void testSpeakDog()
    {
        Dog dog = new Dog();
        String actual = dog.speak();
        String expected = "woof";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDogName()
    {
        Dog dog = new Dog();

        dog.setName("Spot");
        String expected = "Spot";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Fido");
        String expected = "Bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDogNameTest() {
        Dog dog = new Dog("Twitter");
        dog.setName("Tweet");
        String expected = "Tweet";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogNameTest() {
        Dog dog = new Dog("Twitter");
        String expected = "Twitter";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

}
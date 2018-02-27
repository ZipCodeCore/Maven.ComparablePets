package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speakTest() {
        Dog dog = new Dog("Ripley");
        String expected = "Bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Dog dog = new Dog("");
        String expected = "Ripley";
        dog.setName("Ripley");
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}
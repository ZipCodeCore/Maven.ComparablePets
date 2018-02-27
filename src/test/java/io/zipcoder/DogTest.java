package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getNameOfDogsTest() {

       Dog dog = new Dog("Butch");

        String expected = "Butch";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("");
        String expected = "bark";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }
    }
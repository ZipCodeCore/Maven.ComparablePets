package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {


    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog("Spike");

        //When
        String expected = "woof";
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        Dog dog = new Dog("Sally");

        //When
        String expected = "Sally";
        dog.setPetName(expected);
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnicornTest {


    @Test
    public void speakTest() {
        //Given
        Unicorn unicorn = new Unicorn("Shine");

        //When
        String expected = "sparkles glitter";
        String actual = unicorn.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        Unicorn unicorn = new Unicorn("Rainbow");

        //When
        String expected = "Rainbow";
        unicorn.setPetName(expected);
        String actual = unicorn.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {


    @Test
    public void speakTest() {
        //Given
        Cat cat = new Cat("Sammy");

        //When
        String expected = "meow";
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        Cat cat = new Cat("Kitty");

        //When
        String expected = "Kitty";
        cat.setPetName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
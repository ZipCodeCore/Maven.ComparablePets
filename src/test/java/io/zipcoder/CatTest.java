package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getNameOfCatsTest() {

        Cat cat = new Cat();
        cat.setName("Felix");
        String expected = "Felix";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat();
        String expected = "meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);

    }

}
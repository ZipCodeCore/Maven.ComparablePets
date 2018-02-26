package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Mittens");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCarNameTest() {
        Cat cat = new Cat("Twitter");
        cat.setName("Tweet");
        String expected = "Tweet";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCarNameTest() {
        Cat cat = new Cat("Twitter");
        String expected = "Twitter";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

}

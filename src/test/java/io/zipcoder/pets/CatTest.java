package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat cat = new Cat("Mews");
    @Test
    public void speakTest() {
        String expected = "Meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Barb";
        cat.setName("Barb");
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }
}

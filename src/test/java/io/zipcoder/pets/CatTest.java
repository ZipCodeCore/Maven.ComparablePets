package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat testCat = new Cat();

    @Test
    public void catNameTest(){
        testCat.setName("Joe");
        String expected = "Joe";
        String actual = testCat.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void catSpeakTest(){
        String expected = "Meow";
        String actual = testCat.speak();

        Assert.assertEquals(actual, expected);
    }
}

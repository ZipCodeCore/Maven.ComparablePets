package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catSpeakTest(){
        Cat cat = new Cat("Stan");
        String sound = "Meow!";
        String expected = sound;
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void catNameTest(){
        Cat cat = new Cat("Stan");
        String name = "Stan";
        String expected = name;
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testConstructor(){
        Cat cat = new Cat("Sally");
        String expected = "Sally";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetType(){
        Cat cat = new Cat();
        String expected = "cat";
        String actual = cat.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Cat cat = new Cat("Sally");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}

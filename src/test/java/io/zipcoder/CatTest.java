package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testInheritance() {
        Pet p = new Cat();
        Assert.assertTrue(p instanceof Pet);
    }


    @Test
    public void testGetName() {
        Cat cat = new Cat();
        String expectedName = "Baby";
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSpeak(){
        Cat cat = new Cat();
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}

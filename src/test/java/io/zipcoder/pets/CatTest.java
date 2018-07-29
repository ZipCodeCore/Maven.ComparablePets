package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testInheritance() {
        Cat cat = new Cat("Baby", "Meow", "Cat");
        Assert.assertTrue(cat instanceof Pet);
    }


    @Test
    public void testGetName() {
        Cat cat = new Cat("Baby", "Meow", "Cat");
        String expectedName = "Baby";
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetName() {
        Cat cat = new Cat("Baby", "Meow", "Cat");
        String expectedName = "Baby";
        cat.setName("Baby");
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetSpeak(){
        Cat cat = new Cat("Baby", "Meow", "Cat");
        String expected = "Meow";
        cat.setSpeak("Meow");
        String actual = cat.getSpeak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetSpeak(){
        Cat cat = new Cat("Baby", "Meow", "Cat");
        String expected = "Meow";
        String actual = cat.getSpeak();
        Assert.assertEquals(expected, actual);
    }
}

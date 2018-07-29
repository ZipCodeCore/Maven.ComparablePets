package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testInheritance() {
        Dog dog = new Dog("Cookie", "Woof", "Dog");
        Assert.assertTrue(dog instanceof Pet);
    }


    @Test
    public void testGetName() {
        Dog dog = new Dog("Cookie", "Woof", "Dog");
        String expectedName = "Cookie";
        String actualName = dog.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        Dog dog = new Dog("Cookie", "Woof", "Dog");
        String expected = "Cookie";
        dog.setName("Cookie");
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testGetSpeak(){
        Dog dog = new Dog("Cookie", "Woof", "Dog");
        String expected = "Woof";
        String actual = dog.getSpeak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetSpeak(){
        Dog dog = new Dog("Cookie", "Woof", "Dog");
        String expected = "Woof";
        dog.setSpeak("Woof");
        String actual = dog.getSpeak();
        Assert.assertEquals(expected, actual);
    }
}

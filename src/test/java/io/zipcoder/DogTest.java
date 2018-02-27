package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testInheritance() {
        Dog dog = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }


    @Test
    public void testGetName() {
        Dog dog = new Dog();
        String expectedName = "Cookie";
        String actualName = dog.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void speakTest(){
        Dog dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}

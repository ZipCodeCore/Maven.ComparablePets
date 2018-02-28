package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testConstructor() {
        Dog dog = new Dog("Sandy");
        String expected = "Sandy";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetType(){
        Dog dog = new Dog();
        String expected = "dog";
        String actual = dog.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Dog dog = new Dog("Sandy");
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}

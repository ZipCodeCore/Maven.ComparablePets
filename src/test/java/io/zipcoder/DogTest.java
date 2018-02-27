package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        Dog dog = new Dog("Oreo");
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        Dog dog = new Dog("");
        String expected = "Oreo";
        dog.setName("Oreo");
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}
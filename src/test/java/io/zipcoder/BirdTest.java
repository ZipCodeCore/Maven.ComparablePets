package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class BirdTest {

    @Test
    public void speak() {
        Bird bird = new Bird("Birdie Bird");
        String expected = "Squak";
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        Bird bird = new Bird("");
        String expected = "Ugly Bird";
        bird.setName("Ugly Bird");
        String actual = bird.getName();
        Assert.assertEquals(expected, actual);
    }
}
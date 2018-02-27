package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void speakTest() {
        Bird bird = new Bird("Birdie Bird");
        String expected = "Sqwauk";
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Bird bird = new Bird("");
        String expected = "Big Bird";
        bird.setName("Big Bird");
        String actual = bird.getName();
        Assert.assertEquals(expected, actual);
    }
}
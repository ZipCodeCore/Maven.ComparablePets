package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void birdSpeakTest() {
        Bird bird = new Bird("Polly");
        String expected = "Caw";
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirdNameTest() {
        Bird bird = new Bird("Twitter");
        bird.setName("Tweet");
        String expected = "Tweet";
        String actual = bird.getName();
        Assert.assertEquals(expected, actual);
    }

}

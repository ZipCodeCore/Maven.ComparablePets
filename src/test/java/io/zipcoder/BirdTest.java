package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void testSpeakBird()
    {
        Bird bird = new Bird();
        String actual = bird.speak();
        String expected = "chirp";
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetBirdName()
    {
        Bird bird = new Bird();

        bird.setName("Robin");
        String expected = "Robin";
        String actual = bird.getName();
    }
}

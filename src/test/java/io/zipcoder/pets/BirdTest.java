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

}

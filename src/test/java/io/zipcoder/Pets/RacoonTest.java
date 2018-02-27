package io.zipcoder.Pets;

import org.junit.Assert;
import org.junit.Test;

public class RacoonTest {

    @Test
    public void speakTest() {
        Racoon testRacoon = new Racoon("Marty");

        String expected = "Screeeeeeeech!";
        String actual = testRacoon.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Racoon testRacoon = new Racoon("Marty");

        String expected = "Marty";
        String actual = testRacoon.getName();

        Assert.assertEquals(expected, actual);
    }
}

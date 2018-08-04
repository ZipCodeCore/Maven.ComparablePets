package io.zipcoder.petsTest;

import io.zipcoder.pets.Otter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OtterTest {

    Otter testOtter;

    @Before
    public void setup() {
        testOtter = new Otter("Oliver");
    }

    @Test
    public void speakTest() {
        String expected = "Muahaha";
        String actual = testOtter.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        String expected = "Oliver";
        String actual = testOtter.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Ortleib";
        testOtter.setName("Ortleib");
        String actual = testOtter.getName();
        Assert.assertEquals(expected, actual);
    }
}

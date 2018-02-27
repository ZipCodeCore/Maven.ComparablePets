package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OtterTest {
    Otter anOtter;

    @Before
    public void setup(){
        anOtter = new Otter("Sparky");
    }

    @Test
    public void speakTest(){
        String expected = "Hello";
        String actual = anOtter.speak();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setOtterNameTest(){
        anOtter.setName("Hero");
        String expected  = "Hero";
        String actual = anOtter.getName();

        Assert.assertEquals(expected,actual);
    }

}

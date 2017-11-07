package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {
    Fish flipper =new Fish("flipper");
    @Test
    public void speakTest() throws Exception {


        String expected = "bloop bloop...";

        String actual = flipper.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){

        String expected = "flipper";
        String actual =flipper.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){

        String expected = "goldie";
        flipper.setName("goldie");
        String actual = flipper.getName();
        Assert.assertEquals(expected, actual);
    }
}
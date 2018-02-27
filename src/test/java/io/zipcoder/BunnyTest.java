package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class BunnyTest {
    @Test
    public void testInheritance() {
        Bunny bunny = new Bunny();
        Assert.assertTrue(p instanceof Pet);
    }


    @Test
    public void testGetName() {
        Bunny bunny = new Bunny();
        String expectedName = "Mr. Fluffles";
        String actualName = bunny.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void speakTest(){
        Bunny bunny = new Bunny();
        String expected = "Sniff";
        String actual = bunny.speak();
        Assert.assertEquals(expected, actual);
    }
}

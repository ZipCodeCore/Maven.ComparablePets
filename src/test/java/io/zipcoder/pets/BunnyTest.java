package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class BunnyTest {
    @Test
    public void testInheritance() {
        Bunny bunny = new Bunny("Mr. Fluffles", "Bunny", "Sniff");
        Assert.assertTrue(bunny instanceof Pet);
    }


    @Test
    public void testGetName() {
        Bunny bunny = new Bunny("Mr. Fluffles", "Bunny", "Sniff");
        String expectedName = "Mr. Fluffles";
        String actualName = bunny.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetName() {
        Bunny bunny = new Bunny("Mr. Fluffles", "Bunny", "Sniff");
        String expectedName = "Mr. Fluffles";
        bunny.setName("Mr. Fluffles");
        String actualName = bunny.getName();
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testSetSpeak(){
        Bunny bunny = new Bunny("Mr. Fluffles", "Bunny", "Sniff");
        String expected = "Sniff";
        bunny.setSpeak("Sniff");
        String actual = bunny.getSpeak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetSpeak(){
        Bunny bunny = new Bunny("Mr. Fluffles", "Bunny", "Sniff");
        String expected = "Sniff";
        String actual = bunny.getSpeak();
        Assert.assertEquals(expected, actual);
    }
}

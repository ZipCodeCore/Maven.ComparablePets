package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReptileTest {

    @Test
    public void testSpeakReptil() {
        Reptile reptile = new Reptile();
        String actual = reptile.speak();
        String expected = "meow";
    }

    @Test
    public void getNamesOfReptile() {
        Reptile reptile = new Reptile("Tom");
        String expected = "Tom";
        String actual = reptile.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetReptileName() {
        Reptile reptile = new Reptile();

        reptile.setName("Amonnie");
        String expected = "Amonnie";
        String actual = reptile.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reptileSpeakTest() {
        Reptile reptile = new Reptile("Tom");
        String expected = "Sssss";
        String actual = reptile.speak();
        Assert.assertEquals(expected, actual);
    }

}
package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    @Test
    public void testConstructor() {
        Pets pet = new Pets("Sandy");
        String expected = "Sandy";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Pets pet = new Pets("Sudafed");
        String expected = "Sudafed";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }


}

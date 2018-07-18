package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class PetsTest {

    @Test
    public void testConstructor() {
        Pets pet = new Dog("Sandy");
        String expected = "Sandy";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        Pets pet = new Dog("Sudafed");
        String expected = "Sudafed";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }


}

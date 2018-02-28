package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName() {
    String expected = "Spot";
    Pet pet = new Dog("Spot");
    pet.setName(expected);
     String actual = pet.getName();
    Assert.assertEquals(expected, actual);
    }
}
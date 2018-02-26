package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    @Test
    public void getName() {
        String expected = "Spot";
        Pets pet = new Dog("Spot");
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
}

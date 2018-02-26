package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    // What
    @Test
    public void dogConstructionTest() {
        Pet pet = new Dog("Rover");
        Assert.assertTrue(pet.getClass().equals(new Dog("Rover")));
    }

}

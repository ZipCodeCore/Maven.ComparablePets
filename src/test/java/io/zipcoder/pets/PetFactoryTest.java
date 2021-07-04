package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {

    @Test
    public void testCreatePets() {
        String expected = "Sandy";
        Pets dog = PetFactory.createPets("dog", "Sandy");
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testBark() {
        Pet dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}

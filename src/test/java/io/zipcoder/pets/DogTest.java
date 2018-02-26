package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Fido");
        String expected = "Bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

}
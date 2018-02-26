package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    @Test
    public void getName() {

    }

    @Test
    public void speakTest() {
        Dog dog = new Dog();
        dog.setName();
        String expected = "Animal Sounds";
        String actual = (Pet)
        Assert.assertEquals(expected, actual);
    }
}

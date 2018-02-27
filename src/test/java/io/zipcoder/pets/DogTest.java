package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */

public class DogTest {

    @Test
    public void testDogSpeak() {
        Dog dog = new Dog("Fluffy");
        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

}

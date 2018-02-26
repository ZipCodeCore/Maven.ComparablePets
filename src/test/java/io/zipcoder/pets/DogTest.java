package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog testDog = new Dog();

    @Test
    public void dogNameTest() {
        testDog.setName("Kyle");
        String expected = "Kyle";
        String actual = testDog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest(){
        String expected = "Woof";
        String actual = testDog.speak();

        Assert.assertEquals(expected, actual);
    }
}

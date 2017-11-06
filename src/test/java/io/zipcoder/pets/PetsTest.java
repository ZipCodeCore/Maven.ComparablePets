package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetsTest {

    Pets testdog = new Dog();

    @Test
    public void testName() throws Exception {
        testdog.setName("dog");

        String expected = "dog";
        String actual = testdog.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speak() throws Exception {

        String expeceted = "woof";
        String actual = testdog.speak();

        Assert.assertEquals(expeceted, actual);
    }
    @Test
    public void toStringTest(){
        testdog.setName("bill");
        String expected = "bill is a Dog and says woof";
        String actual = testdog.tostring();

        Assert.assertEquals(expected,actual);
    }
}
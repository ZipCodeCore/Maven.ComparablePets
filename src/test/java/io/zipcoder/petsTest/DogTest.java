package io.zipcoder.petsTest;

import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
    Dog testDog;

    @Before
    public void setup() {
        testDog = new Dog("Walter");
    }

    @Test
    public void speakTest() {
        String expected = "Woof";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        String expected = "Walter";
        String actual = testDog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Arnold";
        testDog.setName("Arnold");
        String actual = testDog.getName();
        Assert.assertEquals(expected, actual);
    }


}

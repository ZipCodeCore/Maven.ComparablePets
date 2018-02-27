package io.zipcoder.petsTest;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    Cat testCat;

    @Before
    public void setup() {
        testCat = new Cat("Walter");
    }

    @Test
    public void speakTest() {
        String expected = "Meow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        String expected = "Walter";
        String actual = testCat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Winston";
        testCat.setName("Winston");
        String actual = testCat.getName();
        Assert.assertEquals(expected, actual);
    }

}

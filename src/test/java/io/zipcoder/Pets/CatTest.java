package io.zipcoder.Pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
        Cat testCat = new Cat("Garfield");

        String expected = "Meow";
        String actual = testCat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Cat testCat = new Cat("Garfield");

        String expected = "Garfield";
        String actual = testCat.getName();

        Assert.assertEquals(expected, actual);
    }


}

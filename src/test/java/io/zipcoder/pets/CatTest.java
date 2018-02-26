package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Mittens");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

}

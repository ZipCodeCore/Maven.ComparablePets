package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testMeow() {
        Pet cat = new Cat();
        String expected = "Meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}

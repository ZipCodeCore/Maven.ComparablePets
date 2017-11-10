package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speak() throws Exception {
        Cat aCat = new Cat("Brian");
        String expected = "Meow!";
        String actual = aCat.speak();
        Assert.assertEquals(expected, actual);
    }

}

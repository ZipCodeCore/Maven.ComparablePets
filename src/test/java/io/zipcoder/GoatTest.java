package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoatTest {

    @Test
    public void speak() throws Exception {
        Goat aGoat = new Goat("Brian");
        String expected = "Go Tee!";
        String actual = aGoat.speak();
        Assert.assertEquals(expected, actual);
    }

}

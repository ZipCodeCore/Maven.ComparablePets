package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() throws Exception {
        Dog aDog = new Dog("Brian");
        String expected = "bark!";
        String actual = aDog.speak();
        Assert.assertEquals(expected, actual);
    }

}

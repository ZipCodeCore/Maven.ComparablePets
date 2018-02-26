package io.zipcoder.PetsTest;

import io.zipcoder.Pets.Cow;
import org.junit.Assert;
import org.junit.Test;

public class CowTest {

    Cow tester = new Cow();

    @Test
    public void setNameTest() {
        tester.setName("George");
        String expected = "George";
        String actual = tester.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String expected = "Mooooooo";
        String actual = tester.speak();

        Assert.assertEquals(expected, actual);
    }
}

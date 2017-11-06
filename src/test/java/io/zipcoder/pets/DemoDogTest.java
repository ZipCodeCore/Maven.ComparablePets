package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DemoDogTest {

    DemoDog demodog = new DemoDog("Dart");
    @Test
    public void speakTest() {
        String expected = "Screech";
        String actual = demodog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Barb";
        demodog.setName("Barb");
        String actual = demodog.getName();

        Assert.assertEquals(expected, actual);
    }
}

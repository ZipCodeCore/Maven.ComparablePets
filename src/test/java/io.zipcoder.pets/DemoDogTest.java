package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DemoDogTest {
    DemoDog demodog = new DemoDog("Dart");

    @Test
    public void speakTest(){
        String expected = "Screech";
        String actual = demodog.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setDemodogName(){
        String expected = "Barb";
        demodog.setName("Barb");

        String actual = demodog.getName();
    }

}

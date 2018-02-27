package io.zipcoder.pets;

import io.zipcoder.Pets.Capybara;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CapybaraTest {

    Capybara testCapy;

    @Before
    public void setup(){
        testCapy = new Capybara("Frederick", 2);
    }

    @Test
    public void setCapyNameAndAgeTest (){

        String expectedName = "Frederick";
        String actualName = testCapy.getName();

        int expectedAge = 2;
        int actualAge = testCapy.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        String expected = "It's me, the Capybara";
        String actual = testCapy.speak();
        Assert.assertEquals(expected,actual);
    }
}

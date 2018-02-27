package io.zipcoder.pets;

import io.zipcoder.pets.Capybara;
import org.junit.Assert;
import org.junit.Test;

public class CapybaraTest {

    Capybara testCapy = new Capybara("Frederick", 2);
    String name;
    int age;

    @Test
    public void setCapyNameAndAgeTest (){

        String expectedName = "";
        String actualName = testCapy.getName();

        int expectedAge = 0;
        int actualAge = testCapy.getAge();

        Assert.assertEquals(expectedName, expectedAge);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        Capybara testCapy = new Capybara("Patrick", 3);
        String expected = "woof";
        String actual = testCapy.speak();
        Assert.assertEquals(expected,actual);
    }
}

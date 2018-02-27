package io.zipcoder.pets;

import io.zipcoder.Pets.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {

    Cat testCat;

    @Before
    public void setup(){
        testCat = new Cat("Bubbles", 2);
    }


    @Test
    public void setCatNameAndAgeTest (){
        String expectedName = "Bubbles";
        String actualName = testCat.getName();
        int expectedAge = 2;
        int actualAge = testCat.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        Cat testCat = new Cat("Bubbles", 2);
        String expected = "Meow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }
}

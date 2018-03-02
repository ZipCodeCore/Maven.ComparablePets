package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    Dog aDogTest;

    @Before
    public void setup(){
        aDogTest=new Dog("Fido");
    }
    @Test
    public void speakTest(){
        String expected = "Woof!";
        String actual = aDogTest.speak();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setDogNameTest(){
        aDogTest.setName("aaaa");
        String expected = "aaaa";
        String actual = aDogTest.getName();

        Assert.assertEquals(expected,actual);
    }
}

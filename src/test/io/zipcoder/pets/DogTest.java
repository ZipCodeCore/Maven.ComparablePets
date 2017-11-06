package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {
    Dog bowser=new Dog("bowser");
    @Test
    public void speakTest() throws Exception {


        String expected = "woof woof";

        String actual = bowser.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){

        String expected = "bowser";
        String actual =bowser.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){

        String expected = "harlow";
        bowser.setName("harlow");
        String actual = bowser.getName();
        Assert.assertEquals(expected, actual);
    }
}
package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    Cat kiki=new Cat("kiki");
    @Test
    public void speakTest() throws Exception {


        String expected = "meow meow!";

        String actual = kiki.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){

        String expected = "kiki";
        String actual =kiki.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){

        String expected = "lili";
        kiki.setName("lili");
        String actual = kiki.getName();
        Assert.assertEquals(expected, actual);
    }

}
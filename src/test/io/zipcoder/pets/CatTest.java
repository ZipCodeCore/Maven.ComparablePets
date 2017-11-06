package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

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
        String actual =kiki.getNames();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){

        String expected = "lili";
        kiki.setName("lili");
        String actual = kiki.getNames();
        Assert.assertEquals(expected, actual);
    }

}
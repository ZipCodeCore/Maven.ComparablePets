package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
    public Cat aCatTest;

    @Before
    public void setup() {
        aCatTest = new Cat("Zina");
    }
    @Test
    public void speakTest(){

     String expected = "Meow!";
     String actual = aCatTest.speak();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void setCatNameTest(){
        String expected = "Gabby";
        aCatTest.setName("Gabby");
        String actual = aCatTest.getName();
        Assert.assertEquals(expected,actual);
    }

}

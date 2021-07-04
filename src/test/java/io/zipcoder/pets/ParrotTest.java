package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void constructorTest() {
        Parrot parrot = new Parrot("Id");
        String expected = "Id";
        String actual = parrot.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetType(){
        Parrot parrot = new Parrot();
        String expected = "parrot";
        String actual = parrot.getType();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        //given
        Parrot parrot = new Parrot("Id");
        String expected = "Hello";
        String actual = parrot.speak();
        Assert.assertEquals(expected, actual);

    }
}

package io.zipcoder.io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnicornTest {


    @Test
    public void speak() {
        //Given
        Unicorn unicorn = new Unicorn();
        //When
        String expected = "* sparkles * glitter *";
        String actual = unicorn.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetName(){
        //Given
        Unicorn unicorn = new Unicorn();
        String expected = "Lucky";
        unicorn.setPetName(expected);
        //When
        String actual = unicorn.getPetName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
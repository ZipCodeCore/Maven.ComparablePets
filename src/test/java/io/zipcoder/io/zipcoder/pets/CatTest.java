package io.zipcoder.io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speak() {
        //Given
        Cat cat = new Cat();
        //When
        String expected = "meow";
        String actual = cat.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetName(){
        //Given
        Cat cat = new Cat();
        String expected = "Hugo";
        cat.setPetName(expected);
        //When
        String actual = cat.getPetName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
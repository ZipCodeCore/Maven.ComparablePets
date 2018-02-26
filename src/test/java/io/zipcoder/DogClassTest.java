package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogClassTest {
    @Test
    public void getNameTest(){
        //Given
        Dog dogTest = new Dog();
        String expected = "Hemi";
        //Then
        String actual = dogTest.getName();
        //When
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Dog dogTest = new Dog();
        String expected = "Hemi";
        //Then
        dogTest.setName(expected);
        String actual = dogTest.getName();
        //When
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Dog dogTest = new Dog();
        String expected = "Woof";
        //Then
        String actual = dogTest.speak();
        //When
        Assert.assertEquals(expected, actual);
    }
}

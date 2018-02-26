package io.zipcoder.pets;

import io.zipcoder.Application;
import org.junit.Assert;
import org.junit.Test;



public class PetTest {

    @Test
    public void setNameTest(){
        //Given
        Pet test = new Dog();

        //When
        test.setName("fido");
        String expected = "fido";
        String actual = test.getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        //Given
        Pet test = new Dog();

        //When
        String expected = "Woof!";
        String actual = test.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }






}

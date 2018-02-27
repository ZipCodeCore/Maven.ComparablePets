package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog dogTest;

    @Test
    public void speakTest(){
        //Given
        dogTest = new Dog();

        //When
        String expected = "Woofy";
        String actual = dogTest.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest(){
        //Given
        dogTest = new Dog();
        String name = "Chewy";
        dogTest.setName(name);

        //When
        String expected = "Chewy";
        String actual = dogTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}

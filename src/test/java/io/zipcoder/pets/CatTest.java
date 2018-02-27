package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat catTest;

    @Test
    public void speakTest(){
    //Given
    catTest = new Cat();

    //When
    String expected = "Meow";
    String actual = catTest.speak();

    //Then
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        catTest = new Cat();
        String name = "Whiskey";
        catTest.setName(name);

        //When
        String expected = "Whiskey";
        String actual = catTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}

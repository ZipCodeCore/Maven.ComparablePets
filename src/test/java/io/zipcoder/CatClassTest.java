package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatClassTest {

    @Test
    public void getNameTest(){
        //Given
        Cat catTest = new Cat();
        String expected = "Mew";
        //When
        String actual = catTest.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Cat catTest = new Cat();
        String expected = "Kerri";
        //When
        catTest.setName(expected);
        String actual = catTest.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Cat catTest = new Cat();
        String expected = "Meow";
        //When
        String actual = catTest.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void setNameTest(){
        //Given
        Cat test = new Cat();

        //When
        test.setName("Coder Cat");
        String expected = "Coder Cat";
        String actual = test.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        //Given
        Cat test = new Cat();

        //When
        String expected = "Meow!";
        String actual = test.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }
}

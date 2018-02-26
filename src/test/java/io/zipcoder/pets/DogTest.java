package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void setNameTest(){
        //Given
        Dog test = new Dog();

        //When
        test.setName("Doggy McDogface");
        String expected = "Doggy McDogface";
        String actual = test.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        //Given
        Dog test = new Dog();

        //When
        String expected = "Woof!";
        String actual = test.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class KangarooTest {

    @Test
    public void setNameTest(){
        //Given
        Kangaroo test = new Kangaroo();

        //When
        test.setName("Kangaroo Jack");
        String expected = "Kangaroo Jack";
        String actual = test.getName();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        //Given
        Kangaroo test = new Kangaroo();

        //When
        String expected = "Get Krunk!!!";
        String actual = test.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

}

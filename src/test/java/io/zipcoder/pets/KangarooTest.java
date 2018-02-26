package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class KangarooTest {

    Kangaroo kangarooTest;

    @Test
    public void speakTest(){
        //Given
        kangarooTest = new Kangaroo();

        //When
        String expected = "Get Krunk!";
        String actual = kangarooTest.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        kangarooTest = new Kangaroo();
        String name = "Rupert";
        kangarooTest.setName(name);

        //When
        String expected = "Rupert";
        String actual = kangarooTest.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }
}

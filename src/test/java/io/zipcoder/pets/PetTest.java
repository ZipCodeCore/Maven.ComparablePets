package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    Pet petTest;

    @Test
    public void setNameTest(){
    //Given
    petTest = new Dog();
    String name = "Rupert";
    petTest.setName(name);

    //When
    String expected = "Rupert";
    String actual = petTest.getName();

    //Then
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
    //Given
    petTest = new Dog();

    //When
    String expected = "Woof";
    String actual = petTest.speak();

    //Then
    Assert.assertEquals(expected,actual);
    }
}

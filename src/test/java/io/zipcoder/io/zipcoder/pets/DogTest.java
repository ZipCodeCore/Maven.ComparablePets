package io.zipcoder.io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void speak() {
        //Given
        Dog dog = new Dog();
        //When
        String expected = "woof";
        String actual = dog.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetName(){
        //Given
        Dog dog = new Dog();
        String expected = "Cody";
        dog.setPetName(expected);
        //When
        String actual = dog.getPetName();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
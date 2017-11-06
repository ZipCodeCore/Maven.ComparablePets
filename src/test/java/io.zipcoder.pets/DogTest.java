package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    Dog dog = new Dog("Steve");

    @Test
    public void speakTest(){
        String expected = "Woof";
        String actual = dog.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setDogName(){
        String expected = "Barb";
        dog.setName("Barb");

        String actual = dog.getName();
    }
}

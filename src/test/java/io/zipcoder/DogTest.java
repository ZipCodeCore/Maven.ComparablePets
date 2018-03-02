package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak() {
        // Arrange: create an instance variable (myCat) of the object to act on
        Dog myDog = new Dog("Sparky");
        String expected = "Bark!";
        //Act: call method on our object
        String actual =  myDog.speak();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetName(){
        // Arrange: create an instance variable (myCat) of the object to act on
        Dog myDog = new Dog("Sparky");
        String expected = "Sparky";
        //Act: call method on our object
        String actual =  myDog.getName();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected,actual);

    }

}

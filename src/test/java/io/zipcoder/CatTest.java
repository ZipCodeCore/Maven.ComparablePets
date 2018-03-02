package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak() {
        // Arrange: create an instance variable (myCat) of the object to act on
        Cat myCat = new Cat("Smalls");
        String expected = "Meow!";
        //Act: call method on our object
        String actual =  myCat.speak();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetName(){
        Cat myCat = new Cat("Smalls");
        String expected = "Smalls";
        //Act: call method on our object
        String actual =  myCat.getName();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testSetName(){

    }
}

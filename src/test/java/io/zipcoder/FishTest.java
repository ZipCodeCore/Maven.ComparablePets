package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {
    @Test
    public void testSpeak() {
        // Arrange: create an instance variable (myCat) of the object to act on
        Fish myFish = new Fish("Tony");
        String expected = "tinkles";
        //Act: call method on our object
        String actual = myFish.speak();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
        // Arrange: create an instance variable (myCat) of the object to act on
        Fish myFish = new Fish("Tony");
        String expected = "Tony";
        //Act: call method on our object
        String actual = myFish.getName();
        //Assert: check the outcome on what we expect.
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog testDog = new Dog("testDog", 2);

    @Test
    public void getDogNameAndAgeTest(){
        String expectedName = "testDog";
        String actualName = testDog.getName();

        int expectedAge = 2;
        int actualAge = testDog.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }

}

package io.zipcoder.io.zipcoder.pets;

import io.zipcoder.io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog testDog = new Dog("testDog", 2);

    @Test
    public void setDogNameAndAgeTest(){
        String expectedName = "testDog";
        String actualName = testDog.getName();

        int expectedAge = 2;
        int actualAge = testDog.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);

    }

    @Test
    public void speakTest(){
        Dog testDog = new Dog("Spike",2);
        String expected = "Spike";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

}

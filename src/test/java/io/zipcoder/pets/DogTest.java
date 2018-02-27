package io.zipcoder.pets;

import io.zipcoder.Pets.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    Dog testDog;

    @Before
    public void setup(){
        testDog = new Dog("testDog", 2);
    }

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
        String expected = "Woof";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }

}

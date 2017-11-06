package io.zipcoder;

import io.zipcoder.pet.Dog;
import io.zipcoder.pet.Pet;
import org.junit.Assert;
import org.junit.Test;

public class petTest {
    Pet testPet = new Dog();

    @Test
    public void nameTest(){
        String expected = "doggy";
        testPet.setName("doggy");

        String actual = testPet.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        String expected = "woof";

        String actual = testPet.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        String expected = "billy is a dog, and says woof";
        testPet.setName("billy");

        String actual = testPet.toString();

        Assert.assertEquals(expected,actual);
    }
}

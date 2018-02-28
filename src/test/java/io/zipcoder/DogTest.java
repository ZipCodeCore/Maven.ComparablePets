package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class DogTest {


    @Test
    public void testSpeakDog() {
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "meow";
    }

    @Test
    public void getNamesOfDogs() {
        Dog dog = new Dog("Balto");
        String expected = "Balto";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDogName() {
        Dog dog = new Dog();

        dog.setName("Amonnie");
        String expected = "Amonnie";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Balto");
        String expected = "Bark";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }


}
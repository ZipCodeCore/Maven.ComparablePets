package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class DogTest {

    @Test
    public void testSpeakDog() {
        Dog dog = new Dog();
        String actual = dog.speak();
        String expected = "woof";
    }

    @Test
    public void getNamesOfDog() {
        Dog dog = new Dog("Chance");
        String expected = "Chance";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetDogName() {
        Dog dog = new Dog();

        dog.setName("Spot");
        String expected = "Spot";
        String actual = dog.getName();
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Chance");
        String expected = "I'm such a wimp! I'm running from a cat!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}

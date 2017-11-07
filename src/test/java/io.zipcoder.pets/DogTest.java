package io.zipcoder.pets;

import org.junit.*;


public class DogTest {

    @Test
    public void testSpeak() {
        Dog dog = new Dog("Copper");
        String expected = " says 'Roooof!!!'";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }

}

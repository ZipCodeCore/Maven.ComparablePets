package io.zipcoder.pets;

import org.junit.*;


public class CatTest {

    @Test
    public void testSpeak() {
        Cat cat = new Cat("Figaro");
        String expected = " says 'Meow!'";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);

    }

}

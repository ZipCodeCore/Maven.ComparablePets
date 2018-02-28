package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class CatTest {

    @Test
    public void testSpeakCat() {
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "meow";
    }

    public void getNamesOfCats() {
        Cat cat = new Cat("Tom");
        String expected = "Tom";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCatName()
    {
        Cat cat = new Cat();

        cat.setName("Felix");
        String expected = "Felix";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    public void catSpeakTest() {
        Cat cat = new Cat("Tom");
        String expected = "Hang in there.";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}

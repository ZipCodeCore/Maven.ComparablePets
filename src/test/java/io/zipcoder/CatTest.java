package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class CatTest {


    @Test
    public void testSpeakCat() {
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "meow";
    }

    @Test
    public void getNamesOfCats() {
        Cat cat = new Cat("Leia");
        String expected = "Leia";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCatName() {
        Cat cat = new Cat();

        cat.setName("Amonnie");
        String expected = "Amonnie";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("Leia");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

}
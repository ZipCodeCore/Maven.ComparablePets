package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speak1() {
        Cat cat = new Cat("Yelp");
        String actual = cat.speak();
        String expected = "Mow mow...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak2() {
        Cat cat = new Cat("Paul");
        String actual = cat.speak();
        String expected = "Mow mow...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak3() {
        Cat cat = new Cat("Opal");
        String actual = cat.speak();
        String expected = "Mow mow...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogNameConstructorTest() {
        Cat cat = new Cat("Ovard");
        Assert.assertEquals("Ovard", cat.getName());
    }
    @Test
    public void dogTypeConstructorTest() {
        Cat cat = new Cat("Pumpkin");
        Assert.assertEquals("cat", cat.getType());
    }

}

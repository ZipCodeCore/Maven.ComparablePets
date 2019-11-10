package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speak1() {
        Dog doge = new Dog("Bobert");
        String actual = doge.speak();
        String expected = "Wooooooof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak2() {
        Dog doge = new Dog("Harold");
        String actual = doge.speak();
        String expected = "Wooooooof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak3() {
        Dog doge = new Dog("Mary");
        String actual = doge.speak();
        String expected = "Wooooooof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogNameConstructorTest() {
        Dog doge = new Dog("Bob");
        Assert.assertEquals("Bob", doge.getName());
    }
    @Test
    public void dogTypeConstructorTest() {
        Dog doge = new Dog("Bob");
        Assert.assertEquals("dog", doge.getType());
    }

}

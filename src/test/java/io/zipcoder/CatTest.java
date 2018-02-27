package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speak() {
        Cat cat = new Cat("Fitzgerald");
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        Cat cat = new Cat("");
        String expected = "Fitzgerald";
        cat.setName("Fitzgerald");
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

}
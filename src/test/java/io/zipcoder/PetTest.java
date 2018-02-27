package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getNameTest() {
        Cat cat = new Cat("Fitzgerald");
        String actual = cat.getName();
        String expected = "Fitzgerald";
        Assert.assertEquals(expected, actual);

    }
}
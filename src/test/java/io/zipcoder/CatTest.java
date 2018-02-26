package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void getNamesOfCats() {
        Cat cat = new Cat();
        cat.setName("Tom");
        String expected = "Tom";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat();
        cat.setName("Tom");
        String expected = "Hang in there.";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }


}

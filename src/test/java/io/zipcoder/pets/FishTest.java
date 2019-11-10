package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;


public class FishTest {
    @Test
    public void speak1() {
        Fish fsh = new Fish("Yellow");
        String actual = fsh.speak();
        String expected = "Glub glub...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak2() {
        Fish fsh = new Fish("Pail");
        String actual = fsh.speak();
        String expected = "Glub glub...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speak3() {
        Fish fsh = new Fish("Martin");
        String actual = fsh.speak();
        String expected = "Glub glub...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogNameConstructorTest() {
        Fish doge = new Fish("Bob");
        Assert.assertEquals("Bob", doge.getName());
    }
    @Test
    public void dogTypeConstructorTest() {
        Fish doge = new Fish("Eagle");
        Assert.assertEquals("fish", doge.getType());
    }

}

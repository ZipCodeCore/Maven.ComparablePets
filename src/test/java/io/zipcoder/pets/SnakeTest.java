package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {

    Snake testSnake = new Snake();

    @Test
    public void snakeNameTest(){
        String expected = "April";
        testSnake.setName(expected);
        String actual = testSnake.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void snakeSpeakTest() {
        String expected = "Hiss";
        String actual = testSnake.speak();

        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    @Before
    public void setUp() {
    }


    @Test
    public void getNameOfSnakesTest() {

        Snake snake = new Snake();
        snake.setName("Luke");
        String expected = "Luke";
        String actual = snake.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void snakeSpeakTest() {
        Snake snake = new Snake();
        String expected = "hiss";
        String actual = snake.speak();

        Assert.assertEquals(expected, actual);


    }


}
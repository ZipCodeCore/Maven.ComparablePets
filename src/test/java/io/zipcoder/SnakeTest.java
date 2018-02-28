package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {

    @Test
    public void getNamesOfSnake() {
        Snake snake = new Snake("Kaa");
        String expected = "Kaa";
        String actual = snake.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void snakeSpeakTest() {
        Snake snake = new Snake("Kaa");
        String expected = "I have seen all the dead seasons, and the great trees and the old elephants, " +
                "and the rocks that were bare and sharp-pointed ere the moss grew.  Art thou still alive, Manling?";
        String actual = snake.speak();
        Assert.assertEquals(expected, actual);
    }
/*
    @Test
    public void ge
    */
}

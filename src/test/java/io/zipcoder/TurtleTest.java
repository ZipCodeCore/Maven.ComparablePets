package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by Frankie on 02/26/18
 */
public class TurtleTest {
    Turtle turtle;
    /**
     * the turtle class should extend the Pet class
     * Should feature a null constructor that defaults name = "";
     * and feature a name constructor that sets this.name = name;
     */

    @Before
    public void instantiateturtle() {
        String name = "Crush";
        turtle = new Turtle(name);
    }

    @Test
    public void speakTest() {
        String response = turtle.speak();
        String expected = "WEEESNAW!";
        Assert.assertEquals(expected, response);
        /* looks something like:
        public String speak() {
        Animal turtle = new Animal() {
            @Override
            public String speak() {
                return "Meow";
            }
        };
        return turtle.speak();
    }
         */
    }


    @Test
    public void getNameTest1(){
        String actual = turtle.getName();
        String expected = "Crush";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest2(){
        turtle = new Turtle();
        String actual = turtle.getName();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by Frankie on 02/26/18
 */
public class CatTest {
    Cat cat;

    /**
     * the Cat class should extend the Pet class
     * Should feature a null constructor that defaults name = "";
     * and feature a name constructor that sets this.name = name;
     */

    @Before
    public void instantiateCat() {
        String name = "Bob";
        cat = new Cat(name);
    }

    @Test
    public void speakTest() {
        String response = cat.speak();
        String expected = "Meow (ever so softly)";
        Assert.assertEquals(expected, response);
        /* looks something like:
        public String speak() {
        Animal cat = new Animal() {
            @Override
            public String speak() {
                return "Meow";
            }
        };
        return cat.speak();
    }
         */
    }


    @Test
    public void getNameTest1(){
        String actual = cat.getName();
        String expected = "Bob";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest2(){
        cat = new Cat();
        String actual = cat.getName();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}

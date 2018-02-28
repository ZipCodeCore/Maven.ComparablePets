package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * created by Frankie on 02/26/18
 */
public class DogTest {
    Dog dog;
    /**
     * the dog class should extend the Pet class
     * Should feature a null constructor that defaults name = "";
     * and feature a name constructor that sets this.name = name;
     */

    @Before
    public void instantiateDog() {
        String name = "April";
        dog = new Dog(name);
    }

    @Test
    public void speakTest() {
        String response = dog.speak();
        String expected = "Woof!";
        Assert.assertEquals(expected, response);
        /* looks something like:
        public String speak() {
        Animal dog = new Animal() {
            @Override
            public String speak() {
                return "Meow";
            }
        };
        return dog.speak();
    }
         */
    }


    @Test
    public void getNameTest1(){
        String actual = dog.getName();
        String expected = "April";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest2(){
        dog = new Dog();
        String actual = dog.getName();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}

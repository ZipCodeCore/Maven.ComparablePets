package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogSpeakTest(){
        Dog dog = new Dog("Roger");
        String sound = "Woof!";
        String expected = sound;
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void dogNameTest(){
        Dog dog = new Dog("Roger");
        String name = "Roger";
        String expected = name;
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
}

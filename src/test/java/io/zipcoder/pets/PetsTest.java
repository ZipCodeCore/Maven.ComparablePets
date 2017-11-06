package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetsTest {

    Pets testdog = new Dog();
    Pets testcat = new Cat();
    ArrayList<Pets> testarray = new ArrayList <>();

    @Test
    public void testName() throws Exception {
        testdog.setName("dog");

        String expected = "dog";
        String actual = testdog.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speak() throws Exception {

        String expeceted = "woof";
        String actual = testdog.speak();

        Assert.assertEquals(expeceted, actual);
    }
    @Test
    public void toStringTest(){
        testdog.setName("bill");
        String expected = "bill is a Dog and says woof";
        String actual = testdog.tostring();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCompareTo(){
        testcat.setName("bob");
        testdog.setName("albert");


        testarray.add(testcat);
        testarray.add(testdog);

        Collections.sort(testarray);
        String expected = "albert";
        String actual = testarray.get(0).getName();

        Assert.assertEquals(expected,actual);

    }
}
package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class CatTest {

    @Test
    public void testCatSpeak(){
        Cat catTest = new Cat("Hendrix");
        String expected = "meow";
        String actual = catTest.speak();

        Assert.assertEquals(expected, actual);
    }
}

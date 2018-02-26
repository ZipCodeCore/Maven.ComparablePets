package io.zipcoder.PetsTest;

import io.zipcoder.Pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat tester = new Cat();

    @Test
    public void getCatName() {
        tester.setName("George");
        String expected = "George";
        String actual = tester.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String expected = "Meow";
        String actual = tester.speak();
        Assert.assertEquals(expected, actual);
    }
}

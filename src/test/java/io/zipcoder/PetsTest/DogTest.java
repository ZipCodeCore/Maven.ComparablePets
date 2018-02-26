package io.zipcoder.PetsTest;

import io.zipcoder.Pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    Dog tester = new Dog();

    @Test
    public void getNameTest() {
        tester.setName("George");
        String expected = "George";
        String actual = tester.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String expected = "Woof";
        String actual = tester.speak();

        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.PetsTest;

import io.zipcoder.Application;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Cow;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PetsTest {
    Pet tester = new Pet();

    @Test
    public void getPetNameTest() {
        tester.setName("George");
        String expected = "George";
        String actual = tester.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String expected = "Animal sounds";
        String actual = tester.speak();
        Assert.assertEquals(expected, actual);
    }

}

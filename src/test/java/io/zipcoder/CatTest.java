package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
/**
 * MADE BY APRIL!
 */
public class CatTest {
    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat();
    }

    @Test
    public void setPetNameTest() {
        String petName = "Whiskers";
        cat.setPetName(petName);
        boolean nameHasBeenSet = cat.getPetName().contains(petName);
        assertTrue(nameHasBeenSet);
    }

    @Test
    public void speakTest() {
        String actual = cat.speak();
        String expected = "Meow";
        assertEquals(expected, actual);
    }
}


package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
/**
 * MADE BY APRIL!
 */
public class DogTest {
    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog();
    }
    @Test
    public void setPetNameTest(){
        String petName = "Doug";
        dog.setPetName(petName);
        boolean nameHasBeenSet = dog.getPetName().contains(petName);
        assertTrue(nameHasBeenSet);
    }
    @Test
    public void speakTest(){
        String actual = dog.speak();
        String expected = "I just met you and I love you!";
        assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BirdTest {
    Bird bird;

    @Before
    public void setUp(){
        bird = new Bird();
    }
    @Test
    public void setPetNameTest(){
        String petName = "Kevin";
        bird.setPetName(petName);
        boolean nameHasBeenSet = bird.getPetName().contains(petName);
        assertTrue(nameHasBeenSet);
    }
    @Test
    public void speakTest(){
        String actual = bird.speak();
        String expected = "Squawk";
        assertEquals(expected, actual);
    }
}

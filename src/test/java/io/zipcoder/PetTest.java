package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getName() {
        Cat cat = new Cat("Fitzgerald");
        String actual = cat.getName();
        String expected = "Fitzgerald";
        assertEquals(expected, actual);
    }
}
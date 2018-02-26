package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

        @Test
        public void testSetCatName() {
            // Given
           Cat testCat = new Cat();
            String expected = "Fluffy";

            // When
            testCat.setPetName(expected);
            String actual = testCat.getPetName();

            // Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testConstructorCatName() {
            // Given
            String expected = "Fluffy";

            // When
            Cat testCat = new Cat(expected);

            // Then
            String actual = testCat.getPetName();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testspeak() {
            // Given
            String expected = "Meow";

            // When
            Cat testCat = new Cat();

            // Then
            String actual = testCat.speak();
            Assert.assertEquals(expected, actual);
        }

    }

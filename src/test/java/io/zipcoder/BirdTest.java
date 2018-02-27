package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

        @Test
        public void testSetBirdName() {
            // Given
            Bird testBird = new Bird();
            String expected = "Tweety";

            // When
            testBird.setPetName(expected);
            String actual = testBird.getPetName();

            // Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testConstructorDogName() {
            // Given
            String expected = "Tweety";

            // When
            Bird testBird = new Bird(expected);

            // Then
            String actual = testBird.getPetName();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testspeak() {
            // Given
            String expected = "Tweet Tweet";

            // When
            Bird testBird = new Bird();

            // Then
            String actual = testBird.speak();
            Assert.assertEquals(expected, actual);
        }

    }



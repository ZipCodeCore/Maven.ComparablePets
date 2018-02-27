package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class KomodoDragonTest {

    @Test
    public void testKomodoDragonSpeak() {
        KomodoDragon kdTest = new KomodoDragon("Whiskers");
        String expected = "hiss";
        String actual = kdTest.speak();

        Assert.assertEquals(expected, actual);
    }
}

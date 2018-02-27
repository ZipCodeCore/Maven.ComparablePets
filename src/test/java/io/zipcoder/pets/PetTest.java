package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
@SuppressWarnings("unchecked")
public class PetTest {

    @Test
    public void testCompareTo1() {
        Pet dog1 = new Dog("Fluffy");
        Pet cat1 = new Cat("Hendrix");
        Integer expected = 1;
        Integer actual = dog1.compareTo(cat1);

        Assert.assertTrue(actual >= expected);
    }


    @Test
    public void testCompareTo2() {
        Pet dog1 = new Dog("Fluffy");
        Pet dog2 = new Dog("Fluffy");
        Integer expected = 0;
        Integer actual = dog1.compareTo(dog2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo3() {
        Pet dog1 = new Dog("Fluffy");
        Pet kd1 = new KomodoDragon("Whiskers");
        Integer expected = -1;
        Integer actual = dog1.compareTo(kd1);

        Assert.assertTrue(actual <= expected);
    }

    @Test
    public void testCompareTo4() {
        Pet dog1 = new Dog("Fluffy");
        Pet dog2 = new Dog("Tyson");
        Integer expected = 1;
        Integer actual = dog2.compareTo(dog1);

        Assert.assertTrue(actual >= expected);
    }

    @Test
    public void testCompareTo5() {
        Pet kd1 = new KomodoDragon("Whiskers");
        Pet kd2 = new KomodoDragon("Ziggy");
        Integer expected = -1;
        Integer actual = kd1.compareTo(kd2);

        Assert.assertTrue(actual <= expected);
    }
}

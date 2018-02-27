package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class PetTest {

//    @Test
//    public void testDogSpeak() {
//        Dog dog = new Dog("Fluffy");
//        String expected = "woof";
//        String actual = dog.speak();
//
//        Assert.assertEquals(expected, actual);
//    }


    @Test
    public void testCompareTo1() {
        Pet dog1 = new Dog("Fluffy");
        Pet cat1 = new Cat("Hendrix");
        Integer expected = 1;
        Integer actual = cat1.compareTo(dog1);

        Assert.assertEquals(expected, actual);
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

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo4() {
        Pet dog1 = new Dog("Fluffy");
        Pet dog2 = new Dog("Tyson");
        Integer expected = 1;
        Integer actual = dog1.compareTo(dog2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo5() {
        Pet kd1 = new KomodoDragon("Whiskers");
        Pet kd2 = new KomodoDragon("Ziggy");
        Integer expected = -1;
        Integer actual = kd1.compareTo(kd2);

        Assert.assertEquals(expected, actual);
    }
}

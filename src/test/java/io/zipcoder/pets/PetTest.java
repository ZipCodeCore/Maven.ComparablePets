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
    @Test
    public void testCompareDiffPetTypePositive() {
        Pet dog = new Dog();
        Pet cat = new Cat();

        int expected = 1;
        int actual = cat.compareTo(dog);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareDiffPetTypeNegative() {
        Pet Bugs = new Rabbit();
        Pet Sylvester = new Cat();

        int expected = -1;
        int actual = Bugs.compareTo(Sylvester);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareSamePetTypeDiffNamePositive() {
        Pet first = new Dog("Abbey");
        Pet second = new Dog("Ziggy");

        int expected = 1;
        int actual = first.compareTo(second);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareSamePetTypeDiffNameNegative() {
        Pet second = new Dog("Zulu");
        Pet first = new Dog("Arnold");

        int expected = -1;
        int actual = second.compareTo(first);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareSamePetTypeSameName() {
        Pet dog1 = new Dog("Dan");
        Pet dog2 = new Dog("Dan");

        int expected = 0;
        int actual = dog1.compareTo(dog2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {

    }
}

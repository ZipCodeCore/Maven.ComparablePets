package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NameCheckerTest {

    @Test
    public void sortTest() {
        Pet fluffy = new Dog("fluffy");
        Pet catCheeto = new Cat("cheeto");
        Pet dogCheeto = new Dog("cheeto");
        Pet[] pets = {fluffy, catCheeto, dogCheeto};
        Pet[] expected = {catCheeto, dogCheeto, fluffy};
        NameChecker nameChecker = new NameChecker();
        Arrays.sort(pets, nameChecker);
        Pet[] actual = pets;
        Assert.assertArrayEquals(expected, actual);
    }
}

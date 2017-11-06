package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TypeCheckerTest {

    @Test
    public void sortTest() {
        Pet demodogfluffy = new DemoDog("fluffy");
        Pet cat = new Cat("cheeto");
        Pet dogfluffy = new Dog("fluffy");
        Pet[] pets = {demodogfluffy, cat, dogfluffy};
        Pet[] expected = {cat, demodogfluffy, dogfluffy};
        TypeChecker typeChecker = new TypeChecker();
        Arrays.sort(pets, typeChecker);
        Pet[] actual = pets;
        Assert.assertArrayEquals(expected, actual);
    }
}

package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class typeCheckerTest {

    @Test
    public void sortTest(){
        Pet fluffy = new Dog("Fluffy");
        Pet demodogCheeto = new DemoDog("Fluffy");
        Pet catCheeto = new Cat("Cheeto");
        Pet[] pets = {fluffy, demodogCheeto, catCheeto};
        Pet[] expected = {catCheeto, demodogCheeto, fluffy};
        NameChecker NameChecker = new NameChecker();
        Arrays.sort(pets, NameChecker);
        Pet[] actual = pets;
        Assert.assertArrayEquals(expected, actual);



    }
}

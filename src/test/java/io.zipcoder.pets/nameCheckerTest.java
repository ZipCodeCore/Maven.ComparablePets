package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class nameCheckerTest {

    @Test
    public void sortTest(){
        Pet fluffy = new Dog("Fluffy");
        Pet catCheeto = new Cat("Cheeto");
        Pet dogCheeto = new Dog("Cheeto");
        Pet[] pets = {fluffy, dogCheeto, catCheeto};
        Pet[] expected = {catCheeto, dogCheeto, fluffy};
        NameChecker NameChecker = new NameChecker();
        Arrays.sort(pets, NameChecker);
        Pet[] actual = pets;
        Assert.assertArrayEquals(expected, actual);



    }
}

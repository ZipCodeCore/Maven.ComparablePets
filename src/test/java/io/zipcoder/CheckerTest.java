package io.zipcoder;

import io.zipcoder.pet.*;
import org.junit.*;
import java.util.*;

public class CheckerTest {

    Comparator<Pet> classSort = new Checker();
    Pet testDog = new Dog();
    Pet testCat = new Cat();
    ArrayList<Pet> pets = new ArrayList<>();

    @Test
    public void compareTest(){
        testDog.setName("bob");
        testCat.setName("fred");
        pets.add(testDog);
        pets.add(testCat);
        String expected = "fred";

        Collections.sort(pets,classSort);

        String actual = pets.get(0).getName();

        Assert.assertEquals(expected,actual);
    }

}

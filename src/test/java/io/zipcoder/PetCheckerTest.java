package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class PetCheckerTest {

    Comparator classsort = new PetChecker();
    Pets testdog = new Dog();
    Pets testcat = new Cat();
    ArrayList<Pets> test = new ArrayList <>();


    @Test
    public void compare() throws Exception {
        testcat.setName("bobby");
        testdog.setName("albert");

        test.add(testcat);
        test.add(testdog);

        Collections.sort(test,classsort);
        String expected = "bobby";
        String actual = test.get(0).getName();

        Assert.assertEquals(expected,actual);
    }

}
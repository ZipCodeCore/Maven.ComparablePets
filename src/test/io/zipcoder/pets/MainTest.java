package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sortTestComparable() {
        //Given
        ArrayList<Pets> listOfPetsTest = new ArrayList<Pets>();
        listOfPetsTest.add(new Fish("Sandy"));
        listOfPetsTest.add(new Cat("Kiki"));
        listOfPetsTest.add(new Dog("Apple"));
        listOfPetsTest.add(new Cat("Apple"));

        String expected =
                "Apple goes meow meow!\n" +
                "Apple goes woof woof!\n" +
                "Kiki goes meow meow!\n" +
                "Sandy goes bloop bloop...";

        //When
        Collections.sort(listOfPetsTest);
        StringBuilder sb = new StringBuilder();
        for (Pets petTest : listOfPetsTest) {
            sb.append(petTest.getName() + " goes " + petTest.speak() + "\n");
        }

        String actual = sb.toString().trim();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
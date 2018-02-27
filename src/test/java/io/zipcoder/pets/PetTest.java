package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PetTest {

    Pet petTest;

    @Test
    public void setNameTest(){
    //Given
    petTest = new Dog();
    String name = "Rupert";
    petTest.setName(name);

    //When
    String expected = "Rupert";
    String actual = petTest.getName();

    //Then
    Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
    //Given
    petTest = new Dog();

    //When
    String expected = "Woofy";
    String actual = petTest.speak();

    //Then
    Assert.assertEquals(expected,actual);
    }

    @Test
    public void compareToTest(){
        //Given
        ArrayList<Pet> testList = new ArrayList<Pet>();
        Dog chris = new Dog("Chris");
        Dog dennis = new Dog("Dennis");
        Cat albert = new Cat("Albert");
        Cat kristof = new Cat("Kristof");
        Kangaroo bertrand = new Kangaroo("Bertrand");
        Kangaroo ulysses = new Kangaroo("Ulysses");
        Kangaroo adolph = new Kangaroo("Adolph");
        Cat bertrand2 = new Cat("bErtrand");
        Dog bertrand3 = new Dog("beRtrand");
        testList.add(bertrand3);
        testList.add(bertrand);
        testList.add(albert);
        testList.add(chris);
        testList.add(bertrand2);
        testList.add(adolph);
        testList.add(dennis);
        testList.add(ulysses);
        testList.add(kristof);

        //When
        Collections.sort(testList);
        Pet[] expected = {adolph,albert,bertrand2,bertrand3,bertrand,chris,dennis,kristof,ulysses};
        Pet[] actual = testList.toArray(new Pet[testList.size()]);

        //Then
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(actual));
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void comparatorTest(){
        ArrayList<Pet> testList = new ArrayList<Pet>();
        Dog chris = new Dog("Chris");
        Dog dennis = new Dog("Dennis");
        Cat albert = new Cat("Albert");
        Cat kristof = new Cat("Kristof");
        Kangaroo bertrand = new Kangaroo("Bertrand");
        Kangaroo ulysses = new Kangaroo("Ulysses");
        Kangaroo adolph = new Kangaroo("Adolph");
        Cat bertrand2 = new Cat("Bertrand");
        testList.add(bertrand);
        testList.add(albert);
        testList.add(chris);
        testList.add(bertrand2);
        testList.add(adolph);
        testList.add(dennis);
        testList.add(ulysses);
        testList.add(kristof);

        //When
        Pet[] expected = {albert,bertrand2,kristof,chris,dennis,adolph,bertrand,ulysses};
        Collections.sort(testList,chris);
        Pet[] actual = testList.toArray(new Pet[testList.size()]);

    }



}

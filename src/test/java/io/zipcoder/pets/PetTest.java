package io.zipcoder.pets;

import io.zipcoder.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class PetTest {

    @Test
    public void setNameTest(){
        //Given
        Pet test = new Dog();

        //When
        test.setName("fido");
        String expected = "fido";
        String actual = test.getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void speakTest(){
        //Given
        Pet test = new Dog();

        //When
        String expected = "Woof!";
        String actual = test.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void compareToTest(){
        //Given
        ArrayList<Pet> testList = new ArrayList<Pet>();

        Cat Chippy = new Cat("Chippy");
        Cat Steve = new Cat("Steve");
        Dog Zack = new Dog("Zack");
        Kangaroo Chippy2 = new Kangaroo("Chippy");

        testList.add(Zack);
        testList.add(Chippy);
        testList.add(Chippy2);
        testList.add(Steve);

        //When
        Collections.sort(testList);

        Pet[] expected = {Chippy, Chippy2, Steve, Zack};
        Pet[] actual = testList.toArray(new Pet[testList.size()]);

        Assert.assertTrue(Arrays.equals(expected,actual));
    }

    @Test
    public void comparatorTest(){
        //Given
        ArrayList<Pet> testList = new ArrayList<Pet>();

        Cat Whiskey = new Cat("Whiskey");
        Cat Burt = new Cat("Burt");
        Cat Steve = new Cat("Steve");
        Dog Zack = new Dog("Zack");
        Dog Charlie = new Dog("Charlie");
        Dog Alburt = new Dog("Alburt");
        Kangaroo Jack = new Kangaroo("Jack");
        Kangaroo Kirby = new Kangaroo("Kirby");
        Kangaroo Ross = new Kangaroo("Ross");

        testList.add(Whiskey);
        testList.add(Burt);
        testList.add(Steve);
        testList.add(Zack);
        testList.add(Charlie);
        testList.add(Alburt);
        testList.add(Jack);
        testList.add(Kirby);
        testList.add(Ross);

        //When
        Pet[] expected = {Burt, Steve, Whiskey,
                Alburt, Charlie, Zack, Jack, Kirby, Ross};
        Collections.sort(testList, Ross);
        Pet[] actual = testList.toArray(new Pet[testList.size()]);

        //Then
        Assert.assertTrue(Arrays.equals(expected,actual));
    }

}

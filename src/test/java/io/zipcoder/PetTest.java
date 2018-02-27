package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getNameTest() {
        Cat cat = new Cat("Fitzgerald");
        String actual = cat.getName();
        String expected = "Fitzgerald";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        ArrayList<Pet> petListListTest= new ArrayList<Pet>();

        Cat Emerson1 = new Cat("Emerson");
        Cat Fitzgerald = new Cat("Fitzgerald");
        Dog Ripley = new Dog("Ripley");
        Bird BigBird = new Bird ( "Big Bird");
        Dog Emerson2 = new Dog("Emerson");

        petListListTest.add(Emerson1);
        petListListTest.add(Fitzgerald);
        petListListTest.add(Ripley);
        petListListTest.add(BigBird);
        petListListTest.add(Emerson2);

        Collections.sort(petListListTest);
        Pet[] expected = {BigBird,Emerson1,Emerson2,Fitzgerald,Ripley};
        Pet[] actual = petListListTest.toArray(new Pet[petListListTest.size()]);

        Assert.assertTrue(Arrays.equals(expected,actual));

    }

    @Test
    public void compareTest() {
        ArrayList<Pet> petListListTest= new ArrayList<Pet>();

        Cat Emerson1 = new Cat("Emerson");
        Cat Fitzgerald = new Cat("Fitzgerald");
        Dog Ripley = new Dog("Ripley");
        Bird BigBird = new Bird ( "Big Bird");
        Dog Emerson2 = new Dog("Emerson");

        petListListTest.add(Emerson1);
        petListListTest.add(Fitzgerald);
        petListListTest.add(Ripley);
        petListListTest.add(BigBird);
        petListListTest.add(Emerson2);

        Collections.sort(petListListTest, Ripley);
        Pet[] expected = {BigBird,Emerson1,Fitzgerald,Emerson2,Ripley};
        Pet[] actual = petListListTest.toArray(new Pet[petListListTest.size()]);

        Assert.assertTrue(Arrays.equals(expected,actual));

    }

}
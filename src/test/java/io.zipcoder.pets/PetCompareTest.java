package io.zipcoder.pets;

import org.junit.*;

import java.util.Arrays;

public class PetCompareTest {

    @Test
    public void petCompareTest()

    {
        PetCompare petCompare = new PetCompare();

        Pet[] petSort = new Pet[4];
        petSort[0] = new Dog("Copper");
        petSort[1] = new Dog("Bane");
        petSort[2] = new Cat("Bane");
        petSort[3] = new Tariq("Rhino");

        Arrays.sort(petSort, petCompare);

        String expected = ("Bane" + " Bane" + " Copper" + " Rhino ");
        String actual = "";
        for (int i = 0; i < petSort.length; i++) {
            actual += petSort[i].getPetName() + " ";

        }
        Assert.assertEquals(expected, actual);
    }

}

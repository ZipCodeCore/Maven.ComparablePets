package io.zipcoder.comparators;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Horse;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class PetSorterTest {

    Pet[] pets1 ;
    Pet[] pets2;

    Dog dog1 = new Dog("Jack");
    Dog dog2 = new Dog("Ariel");
    Dog dog3 = new Dog("Lucky");
    Dog dog4 = new Dog("Moe");

    Cat cat1 = new Cat("Zippy");
    Cat cat2 = new Cat("Fluffy");
    Cat cat3 = new Cat("Moo");

    Horse horse1 = new Horse("Neigh");
    Horse horse2 = new Horse("Bleigh");


    @Before
    public void setUp() throws Exception {
        pets1 = new Pet[] {dog1,cat1,horse1,dog2,cat2,dog3,horse2,dog4,cat3};
        pets2 = new Pet[] {dog1,dog2,cat3,cat1,dog4,dog3,cat2,horse2,horse1};
    }


    @Test
    public void testInheritance1(){
        Assert.assertTrue(dog1 instanceof Comparable);
    }

    @Test
    public void testInheritance2(){
        Assert.assertTrue(cat1 instanceof Comparable);
    }

    @Test
    public void testInheritance3(){
        Assert.assertTrue(horse1 instanceof Comparable);
    }

    @Test
    public void sort() {
        PetSorter sortedPets = new PetSorter(pets1);
        Comparator<Pet> comparator =  (Comparator<Pet>) new TypeComparator();

        System.out.println(Arrays.toString(pets1));
        Pet [] result = sortedPets.sort(comparator);
        // Arrays.sort(pets1);
        System.out.println(Arrays.toString(pets1));

        Assert.assertArrayEquals(pets1,result);

    }
}
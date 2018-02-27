package io.zipcoder.pets;

import io.zipcoder.Application;
import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {

    @Test
    public void petFactoryTest(){
        //Given
        PetFactory test = new PetFactory();

        //When
        Class expected = Dog.class;
        Pet actual = test.createPet("dog","Fido");

        //Then
        Assert.assertEquals(expected,actual.getClass());
    }

    @Test
    public void petFactoryTest2(){
        //Given
        PetFactory test = new PetFactory();

        //When
        String expected = "Spanky";
        Pet actual = test.createPet("kangaroo","Spanky");


        //Then
        Assert.assertEquals(expected,actual.getName());
    }


}

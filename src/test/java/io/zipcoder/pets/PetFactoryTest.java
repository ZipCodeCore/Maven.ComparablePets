package io.zipcoder.pets;

import io.zipcoder.Application;
import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {

    @Test
    public void petFactoryTest(){
        //Given
        Application tester = new Application();

        //When
        Class expected = Dog.class;
        Pet actual = PetFactory.createPet("Dog", "Stimpy");

        //Then
        Assert.assertEquals(expected, actual.getClass());

    }

    @Test
    public void petFactoryTest2(){
        //Given
        Application tester = new Application();

        //When
        Class expected = Kangaroo.class;
        Pet actual = PetFactory.createPet("Kangaroo", "Finky Fred");

        //Then
        Assert.assertEquals(expected, actual.getClass());

    }
}

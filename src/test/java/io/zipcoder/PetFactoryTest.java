package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetFactoryTest {
    @Test
    public void testCreatePet(){
        //given
        String name = "Spot";
        String type = "Dog";

        //when
       Pet testAnimal =  PetFactory.createPet(type, name);

        Assert.assertEquals(testAnimal.getPetName(),name);
        Assert.assertTrue(testAnimal instanceof Dog);
    }

    @Test
    public void testCreatePet2(){
        //given
        String name = "Fluffy";
        String type = "Cat";

        //when
        Pet testAnimal =  PetFactory.createPet(type, name);

        Assert.assertEquals(testAnimal.getPetName(),name);
        Assert.assertTrue(testAnimal instanceof Cat);
    }

    @Test
    public void testCreatePet3(){
        //given
        String name = "Tweety";
        String type = "Bird";

        //when
        Pet testAnimal =  PetFactory.createPet(type, name);

        Assert.assertEquals(testAnimal.getPetName(),name);
        Assert.assertTrue(testAnimal instanceof Bird);
    }
}

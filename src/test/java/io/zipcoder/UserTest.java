package io.zipcoder;

import io.zipcoder.pet.Cat;
import io.zipcoder.pet.Dog;
import io.zipcoder.pet.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserTest {
    Owner testOwner = new Owner("wes");
    Pet testDog = new Dog();
    Pet testCat = new Cat();
    ArrayList<Pet> pets = new ArrayList<Pet>();


    @Test
    public void nameTest(){
        String expected = "bob";
        testOwner.setName("bob");

        String actual = testOwner.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void petListTest(){
        pets.add(testDog);

        testOwner.setPets(pets);

        testOwner.addPet(testCat);
        String expected = "meow";

        ArrayList<Pet> userPets = testOwner.getPets();

        String actual = userPets.get(1).speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        String expected = "wes has 1 pet.";
        testOwner.addPet(testCat);

        String actual = testOwner.toString();

        Assert.assertEquals(expected,actual);
    }
}

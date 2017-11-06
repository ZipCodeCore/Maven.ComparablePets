package io.zipcoder;

import io.zipcoder.pet.Cat;
import io.zipcoder.pet.Dog;
import io.zipcoder.pet.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserTest {
    User testUser = new User("wes");
    Pet testDog = new Dog();
    Pet testCat = new Cat();
    ArrayList<Pet> pets = new ArrayList<Pet>();


    @Test
    public void nameTest(){
        String expected = "bob";
        testUser.setName("bob");

        String actual = testUser.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void petListTest(){
        pets.add(testDog);

        testUser.setPets(pets);

        testUser.addPet(testCat);
        String expected = "meow";

        ArrayList<Pet> userPets = testUser.getPets();

        String actual = userPets.get(1).speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        String expected = "wes has 1 pet.";
        testUser.addPet(testCat);

        String actual = testUser.toString();

        Assert.assertEquals(expected,actual);
    }
}

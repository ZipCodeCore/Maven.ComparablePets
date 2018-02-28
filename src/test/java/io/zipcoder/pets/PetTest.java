package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;

public class PetTest {

    @Test
    public void sortPetTest(){
        Application test = new Application();
        ArrayList<Pet> petTest = new ArrayList<Pet>();
        Cat cat1 = new Cat("Apple");
        Dog dog2 = new Dog("Apple");
        Dog dog1 = new Dog("Bob");
        Fish fish1 = new Fish("Cathy");
        petTest.add(cat1);
        petTest.add(dog2);
        petTest.add(dog1);
        petTest.add(fish1);
        Collections.sort(petTest);
        String expected = "Apple : Meow!\n" +
                "Apple : Woof!\n" +
                "Bob : Woof!\n" +
                "Cathy : Blub blub\n";
        String actual = test.showPetList(petTest);
        Assert.assertEquals(expected, actual);
    }
}

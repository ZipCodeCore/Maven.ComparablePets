package io.zipcoder.pets;

import org.junit.Test;

import org.junit.Assert;

import java.util.ArrayList;

public class ApplicationTest {

    @Test
    public void showPetTest(){
        Application test = new Application();
        ArrayList<Pet> petTest = new ArrayList<Pet>();
        Cat cat1 = new Cat("Apple");
        Dog dog1 = new Dog("Bob");
        Fish fish1 = new Fish("Cathy");
        petTest.add(cat1);
        petTest.add(dog1);
        petTest.add(fish1);

        String expected = "Apple : Meow!\n" +
                "Bob : Woof!\n" +
                "Cathy : Blub blub\n";
        String actual = test.showPetList(petTest);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addPetTest(){
        Application test = new Application();

        test.addPet("Dog", "Georgie");
        test.addPet("Cat", "Tracy");
        String expected = "[Dog : Georgie, Cat : Tracy]";
        String actual = test.pets.toString();
        Assert.assertEquals(expected, actual);
    }
}


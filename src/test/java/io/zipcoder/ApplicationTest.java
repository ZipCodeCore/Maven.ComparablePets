package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationTest {
    List<Pet> pets = new ArrayList<Pet>();

    @Test
    public void showPetTest() {
        Application testApp = new Application();
        List<Pet> pets = new ArrayList<Pet>();
        Cat cat1 = new Cat("Sally");
        Dog dog1 = new Dog("Bob");
        Racoon racoon1 = new Racoon("Max");
        pets.add(cat1);
        pets.add(dog1);
        pets.add(racoon1);


        String expected =   "Sally: Meow\n" +
                            "Bob: Woof\n" +
                            "Max: Screeeeeeeech!\n";

        String actual = testApp.showPetList(pets);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPetTest() {
        Application testApp = new Application();

        testApp.addPet("Dog", "Bob");
        String expected = "[Dog: Bob]";
        String actual = testApp.pets.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortPetsTest() {
        Application testApp = new Application();
        List<Pet> pets = new ArrayList<Pet>();
        Cat cat1 = new Cat("Sally");
        Dog dog2 = new Dog("Sally");
        Dog dog1 = new Dog("Bob");
        Racoon racoon1 = new Racoon("Max");
        pets.add(cat1);
        pets.add(dog2);
        pets.add(dog1);
        pets.add(racoon1);
        Collections.sort(pets);

        String actual = testApp.showPetList(pets);
        String expected = "Bob: Woof\n" +
                "Max: Screeeeeeeech!\n" +
                "Sally: Meow\n" +
                "Sally: Woof\n";

        Assert.assertEquals(expected, actual);

    }




}

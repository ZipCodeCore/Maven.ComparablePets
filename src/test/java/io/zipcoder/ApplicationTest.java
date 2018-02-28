package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ApplicationTest {

    @Test
    public void getPetArrayListTest() {
        Application application = new Application();
        ArrayList expected = new ArrayList();
        ArrayList actual = application.getPetArrayList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printListOfAllPetsTest() {
        Application application = new Application();
        application.addPetToArrayList(new Cat("Mittens"));
        application.addPetToArrayList(new Dog("Rover"));
        String expected = "Mittens says meow\nRover says bark";
        String actual = application.printListOfAllPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPetToArrayListTest() {
        Application application = new Application();
        Cat cat = new Cat("Mittens");
        application.addPetToArrayList(cat);
        int expected = 1;
        int actual = application.getPetArrayList().size();
        Assert.assertEquals(expected, actual);
    }

}

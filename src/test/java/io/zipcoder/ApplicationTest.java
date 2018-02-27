package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void userDataOfPets() {
    }

    @Test
    public void addPet() {
        //Given
        Application application = new Application();
        //When
        application.addPet("Hugo", "Dog");
        String expected = "Hugo Dog, ";
        String actual = application.printList();
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printListTest() {
            //Given
            Application application = new Application();

            //When
            application.addPet("Hugo", "Dog");
            application.addPet("Bob", "Cat");

            String expected = "Hugo Dog, Bob Cat, ";
            String actual = application.printList();

            //Then
            Assert.assertEquals(expected, actual);

        }


}
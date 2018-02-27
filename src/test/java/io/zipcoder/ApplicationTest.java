package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * MADE BY APRIL!
 */
public class ApplicationTest {

    Application application = new Application();

    @Test
    public void welcomeUserTest() {
        String message = "Welcome interesting person whom I've never met. Please tell me some things about yourself.";
        String actual = application.welcomeMessage();
        Assert.assertEquals(message, actual);
    }

    @Test
    public void getNumberOfPetsTest() {
        int petCount = 2;
        application.setNumberOfPets(petCount);
        boolean numberOFPetsHasBeenSet = application.getNumberOfPets() == (petCount);
        assertTrue(numberOFPetsHasBeenSet);
    }

    @Test
    public void getTypeOfPetTest() {
        String petType = "Dog";
        application.setTypeOfPet(petType);
        boolean typeOfPet = application.getTypeOfPet().equals(petType);
        assertTrue(typeOfPet);
    }

    @Test
    public void getPetNameTest() {
        String petName = "Doug";
        application.setPetName(petName);
        boolean nameHasBeenSet = application.getPetName().equals(petName);
        assertTrue(nameHasBeenSet);
    }

    @Test
    public void listPetsSortedTest() {
        String typeOfPet = "Dog";
        String petName = "Doug";
        application.addPet(typeOfPet, petName);
        String actual = application.listPetsSorted();
        String expected = "Dog : Doug\n";
        assertEquals(expected, actual);
    }

    @Test
    public void addPetTest() {
        String typeOfPet = "Dog";
        String petName = "Doug";
        application.addPet(typeOfPet, petName);
        boolean petHasBeenAdded = application.getApplication(typeOfPet);
        assertTrue(petHasBeenAdded);
    }
}

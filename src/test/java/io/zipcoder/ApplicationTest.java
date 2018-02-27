package io.zipcoder;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    Application application;

    @Before
    public void setUp(){
    application = new Application();
    }

    @Test
    public void welcomeUserTest(){
        String message = "Welcome interesting person whom I've never met. Please tell me some things about yourself. ";
    }
    @Test
    public void getNumberOfPetsTest(){
        int petCount = 2;
        application.setNumberOfPets(petCount);
        boolean numberOFPetsHasBeenSet = application.getNumberOfPets().contains(petCount);
        assertTrue(numberOFPetsHasBeenSet);
    }
    @Test
    public void getTypeOfPetTest(){
        String petType = "Dog";
        application.setTypeOfPet(petType);
        boolean typeOfPet = application.getTypeOfPet().contains(petType);
        assertTrue(typeOfPet);
    }
    @Test
    public void getPetNameTest(){
        String petName = "Doug";
        application.setPetName(petName);
        boolean nameHasBeenSet = application.getPetName().contains(petName);
        assertTrue(nameHasBeenSet);
    }
    @Test
    public void listPetsSortedTest(){
        String typeOfPet = "Dog";
        String petName = "Doug";
        application.addPet(typeOfPet, petName);
        String actual = application.listPetsSorted();
        String expected = "Dog : Doug";
        assertEquals(expected, actual);
    }
    @Test
    public void addPetTest(){
        String typeOfPet = "Dog";
        String petName = "Doug";
        application.addPet(typeOfPet, petName);
        boolean petHasBeenAdded = application.getApplication().containsKey(typeOfPet);
        assertTrue(petHasBeenAdded);
    }
}

package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationTest {

    Application appTest;

    @Test
    public void setNumberOfPetsTest(){
        //Given
        appTest = new Application();
        int numberOfPets = 3;
        appTest.setNumberOfPets(numberOfPets);

        //When
        int expected = 3;
        int actual = appTest.getNumberOfPets();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPetTypeTest(){
        //Given
        appTest = new Application();
        appTest.setPetType("Dog");
        appTest.setPetType("Cat");
        appTest.setPetType("Kangaroo");

        //When
        String expected = "Cat";
        String actual = appTest.getPetType(2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPetName(){
        //Given
        appTest = new Application();
        String nameOfPet = "Bates";
        appTest.setPetType("Bates");

        //When
        String expected = "Bates";
        String actual = appTest.getPetName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildPetMapTest(){
        //Given
        appTest = new Application();
        ArrayList<String> petNames = new ArrayList<String>();
        petNames.add("Bates");
        petNames.add("Cheeks");
        petNames.add("Shakespear");
        petNames.add("Rumples");

        ArrayList<String> petTypes = new ArrayList<String>();
        petTypes.add("Dog");
        petTypes.add("Cat");
        petTypes.add("Kangaroo");
        petTypes.add("Cat");

        appTest.buildPetMap(petNames, petTypes);
        String expected = "Shakespear";
        String actual = appTest.getPetFromMap("Kangaroo");

        Assert.assertEquals(expected, actual);

    }

}

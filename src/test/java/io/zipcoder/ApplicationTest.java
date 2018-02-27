package io.zipcoder;


import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Kangaroo;
import io.zipcoder.pets.Pet;
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
        String actual = appTest.getPetType(1);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPetName(){
        //Given
        appTest = new Application();
        String nameOfPet = "Bates";
        appTest.setPetName("Bates");

        //When
        String expected = "Bates";
        String actual = appTest.getPetName(0);

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
        //petNames.add("Rumples");

        ArrayList<String> petTypes = new ArrayList<String>();
        petTypes.add("Dog");
        petTypes.add("Cat");
        petTypes.add("Kangaroo");
        //petTypes.add("Cat");

        appTest.buildPetMap(petTypes, petNames);
        String expected = "Shakespear";
        String actual = appTest.getPetFromMap("Kangaroo");

        Assert.assertEquals(expected, actual);

    }


}

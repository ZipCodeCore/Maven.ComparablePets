package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ApplicationTest {
    @Test
    public void setNumberOfPetsTest(){
        //Given
        Application tester = new Application();

        //When
        int expected = 5;
        tester.setNumberOfPets(5);
        int actual = tester.getNumberOfPets();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetTypeTest(){
        //Given
        Application tester = new Application();

        //When
        tester.setPetType("Dog");
        tester.setPetType("Cat");
        tester.setPetType("CatDog");
        String expected = "CatDog";
        String actual = tester.getPetType(2);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetTypeTest2(){
        //Given
        Application tester = new Application();

        //When
        tester.setPetType("Dog");
        tester.setPetType("Cat");
        tester.setPetType("CatDog");
        String expected = "Cat";
        String actual = tester.getPetType(1);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetNameTest(){
        //Given
        Application tester = new Application();

        //When
        tester.setPetName("Fido");
        tester.setPetName("Boots");
        tester.setPetName("Nigel");
        String expected = "Nigel";
        String actual = tester.getPetName(2);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPetNameTest2(){
        //Given
        Application tester = new Application();

        //When
        tester.setPetName("Fido");
        tester.setPetName("Boots");
        tester.setPetName("Nigel");
        String expected = "Fido";
        String actual = tester.getPetName(0);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildPetMapTest(){
        //Given
        Application tester = new Application();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> types = new ArrayList<String>();
        names.add("Fido");
        names.add("Boots");
        names.add("Nigel");
        types.add("Dog");
        types.add("Cat");
        types.add("CatDog");

        //When
        tester.buildPetMap(types,names);
        String expected = "Nigel";
        String actual = tester.getPetFromMap("CatDog");

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildPetMapTest2(){
        //Given
        Application tester = new Application();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> types = new ArrayList<String>();
        names.add("Fido");
        names.add("Boots");
        names.add("Nigel");
        types.add("Dog");
        types.add("Cat");
        types.add("CatDog");

        //When
        tester.buildPetMap(types,names);
        String expected = "Boots";
        String actual = tester.getPetFromMap("Cat");

        //Then
        Assert.assertEquals(expected,actual);
    }

}

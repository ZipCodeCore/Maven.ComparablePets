package io.zipcoder.utils;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Fish;
import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

public class PetLodgeTest {
    @Test
    public void createPetFromTypeTest1(){
        //given
        PetLodge cozy = new PetLodge();
        String petName = "bobert";
        String petType = "cat";
        //when
        Pets actual = cozy.createPetFromType(petName, petType);
        //then
        Assert.assertTrue(actual instanceof Cat);
    }

    @Test
    public void createPetFromTypeTest2(){
        //given
        PetLodge cozy = new PetLodge();
        String petName = "beebo";
        String petType = "dog";
        //when
        Pets actual = cozy.createPetFromType(petName, petType);
        //then
        Assert.assertTrue(actual instanceof Dog);
    }

    @Test
    public void createPetFromTypeTest3(){
        //given
        PetLodge cozy = new PetLodge();
        String petName = "bobert";
        String petType = "fish";
        //when
        Pets actual = cozy.createPetFromType(petName, petType);
        //then
        Assert.assertTrue(actual instanceof Fish);
    }

    @Test
    public void createPetsTest1(){
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Petto", "Marvin", "Peanut"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge();
        Pets[] actual = cozy.createPets(numOfPets, petName, petType);
        Assert.assertEquals(3, actual.length);
        for(int i = 0; i < actual.length; i++){
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
    @Test
    public void createPetsTest2(){
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Mark", "Beep", "Jarvis"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge();
        Pets[] actual = cozy.createPets(numOfPets, petName, petType);
        Assert.assertEquals(3, actual.length);
        for(int i = 0; i < actual.length; i++){
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
    @Test
    public void createPetsTest3(){
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Bob", "Man", "Orange"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge();
        Pets[] actual = cozy.createPets(numOfPets, petName, petType);
        Assert.assertEquals(3, actual.length);
        for(int i = 0; i < actual.length; i++){
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
    @Test
    public void constructorTest1() {
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Bob", "Man", "Orange"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge(numOfPets, petName, petType);
        Pets[] actual = cozy.getPets();
        Assert.assertEquals(3, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
    @Test
    public void constructorTest2() {
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Oval", "ManChild", "Umbrella"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge(numOfPets, petName, petType);
        Pets[] actual = cozy.getPets();
        Assert.assertEquals(3, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
    @Test
    public void constructorTest3() {
        String[] petType = {"dog", "cat", "fish"};
        String[] petName = {"Boot", "Marble", "Pint"};
        Integer numOfPets = 3;
        PetLodge cozy = new PetLodge(numOfPets, petName, petType);
        Pets[] actual = cozy.getPets();
        Assert.assertEquals(3, actual.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(petName[i], actual[i].getName());
            Assert.assertEquals(petType[i], actual[i].getType());
        }
    }
}


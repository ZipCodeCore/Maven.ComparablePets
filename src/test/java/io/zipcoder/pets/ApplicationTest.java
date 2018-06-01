package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ApplicationTest {

    @Test
    public void testCreatePetList(){
        Application app = new Application();
        Pets dog = PetFactory.createPets("dog", "Sandy");
        String expected = "Sandy";
        ArrayList<Pets> pets = new ArrayList<>(Arrays.asList(dog));
        String actual = pets.get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPetsToString(){
        Application app = new Application();
        String expected = "My name is Sandy and I say Woof.  ";
        Pets dog = PetFactory.createPets("dog", "Sandy");
        ArrayList<Pets> pets = new ArrayList<>(Arrays.asList(dog));
        String actual = app.petsToString(pets);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCompareByName(){
        //Given
        Pets dog = new Dog("Sandy");
        Pets dog1 = new Dog("Molly");
        Pets cat = new Cat("Sandy");
        Pets cat1 = new Cat("Andy");
        Pets parrot = new Parrot("Id");
        ArrayList<Pets> pets = new ArrayList<Pets>(Arrays.asList(dog, dog1, cat, cat1, parrot));
        ArrayList<Pets> expected = new ArrayList<Pets>(Arrays.asList(cat1, parrot, dog1, cat, dog));
        //When
        Collections.sort(pets, Comparator.comparing(Pets::getName).thenComparing(Pets::getType));
        //Then
        ArrayList<Pets> actual = pets;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCompareByType() {
        //Given
        Pets dog1 = new Dog("Sandy");
        Pets dog2 = new Dog("Molly");
        Pets dog3 = new Dog("Ally");
        Pets cat = new Cat("Sandy");
        Pets cat1 = new Cat("Andy");
        Pets parrot = new Parrot("Id");
        ArrayList<Pets> actual = new ArrayList<Pets>(Arrays.asList(dog1, dog2, dog3, cat, cat1, parrot));
        ArrayList<Pets> expected = new ArrayList<Pets>(Arrays.asList(cat1, cat, dog3, dog2, dog1, parrot));
        //When
        Collections.sort(actual, Comparator.comparing(Pets::getType).thenComparing(Pets::getName));
        //Then
        Assert.assertEquals(expected, actual);
    }

}

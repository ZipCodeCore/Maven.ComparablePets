package io.zipcoder.pets;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplicationTest {

    @Test
    public void testCreatePetList(){
        Application app = new Application();
        Pets dog = PetFactory.createPets("dog", "Sandy");
        String expected = dog.getName();
        ArrayList<Pets> pets = app.createPetList("dog Sandy cat Sally");
        String actual = pets.get(0).getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPetsToString(){
        Application app = new Application();
        String expected = "My name is Sandy and I say Woof";
        Pets dog = PetFactory.createPets("dog", "Sandy");
        ArrayList<Pets> pets = app.createPetList("dog Sandy");
        String actual = app.petsToString();
        Assert.assertEquals(expected, actual);
    }

}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareAnimalClassTest {
    @Test
    public void compareTest(){
        //Given
        PetOwner petOwner = new PetOwner();
        CompareAnimal animal = new CompareAnimal();

        //When
        ArrayList<Pet> petList = new ArrayList<Pet>();
        Cat catTest = new Cat("Maus");
        Dog dogTest = new Dog("Hemi");
        Bird birdTest = new Bird("Tera");
        petList.add(catTest);
        petList.add(dogTest);
        petList.add(birdTest);

        Collections.sort(petList, animal);
        //Then
        String expected = "Tera the Bird\n" + "Maus the Cat\n" + "Hemi the Dog\n";
        String actual = PetOwner.printPetList(petList);
        Assert.assertEquals(expected, actual);
    }
}

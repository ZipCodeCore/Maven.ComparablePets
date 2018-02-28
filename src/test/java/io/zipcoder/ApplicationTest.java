package io.zipcoder;

import org.junit.Test;
import org.junit.Assert;

public class ApplicationTest {

    @Test
    public void testAddPets() {
        //Given
        Application application = new Application();
        Pet pet1 = new Cat();

        //When
        application.add(pet1);
        Pet[] petArray = application.getPets();


        //Then
        Pet firstPet = petArray[0];
        Assert.assertEquals(pet1, firstPet);
    }

    @Test
    public void testGetPets() {
        // Given
        Application application = new Application();
        Pet pet1 = new Dog();
        Pet pet2 = new Cat();
        Pet pet3 = new Snake();
        Pet[] expectedPets = new Pet[]{pet1, pet2, pet3};

        application.add(pet1);
        application.add(pet2);
        application.add(pet3);

        // When
        Pet[] actualPets = application.getPets();

        // Then
        Assert.assertEquals(expectedPets, actualPets);
    }


    @Test
    public void testCreatePet() {
        //Given
        Application application = new Application();
        String petType = "Dog";
        String petName = "Milo";

        // When
        Pet pet = application.createPet(petType, petName);

        //Then
        Assert.assertTrue(pet instanceof Dog);
    }

    @Test
    public void testSomething2() {

    }


}

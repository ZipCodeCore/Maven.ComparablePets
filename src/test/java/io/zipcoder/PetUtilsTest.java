package io.zipcoder;

import io.zipcoder.io.zipcoder.pets.Compare;
import io.zipcoder.io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PetUtilsTest {

    @Test
    public void printList() {
        //Given
        PetUtils utils = new PetUtils();
        //When
        utils.addPet("Hugo", "Dog");
        utils.addPet("Bob", "Cat");
        //Then
        String expected = ("[[Hugo, Dog], [Bob, Cat]]");
        String actual = utils.printList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumberOfPets() {
        //Given
        PetUtils petUtils = new PetUtils();
        petUtils.addPet("Hugo", "Dog");
        petUtils.addPet("Bob", "Cat");
        petUtils.addPet("John", "Unicorn");

        int expected = 3;
        petUtils.setNumberOfPets(expected);
        //When
        int actual = petUtils.getNumberOfPets();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPet() {
        //Given
        PetUtils utils = new PetUtils();

        utils.addPet("Hugo", "Dog");
        String expected = ("[Hugo, Dog]");
        String actual = utils.pets.get(0).toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsPet() {

        PetUtils utils = new PetUtils();

        utils.addPet("Bob", "Cat");

        Assert.assertTrue(utils.containsPet("Bob", "Cat"));
    }

    @Test
    public void compare(){
        //Given
        Compare compare = new Compare();
        PetUtils petUtils = new PetUtils();

        petUtils.addPet("Hugo", "Dog");
        petUtils.addPet("Bob", "Cat");
        petUtils.addPet("John", "Unicorn");

        Collections.sort(petUtils.getPets(), compare);
        String expected = "[[Bob, Cat], [Hugo, Dog], [John, Unicorn]]";
        String actual = petUtils.getPets().toString();

        Assert.assertEquals(expected, actual);
    }

}
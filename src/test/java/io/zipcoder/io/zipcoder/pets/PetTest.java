package io.zipcoder.io.zipcoder.pets;

import io.zipcoder.PetUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class PetTest {

    @Test
    public void compareTo() {

        PetUtils petUtils = new PetUtils();

        petUtils.addPet("Hugo", "Dog");
        petUtils.addPet("Bob", "Cat");
        petUtils.addPet("John", "Unicorn");

        Collections.sort(petUtils.getPets());
        String expected = "[[Bob, Cat], [Hugo, Dog], [John, Unicorn]]";
        String actual = petUtils.getPets().toString();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setPetName() {
        //Given
        Unicorn unicorn = new Unicorn();
        unicorn.setPetName("Blumbo");
        //When
        String expected = unicorn.getPetName();
        String actual = "Blumbo";
        //Then
        Assert.assertEquals(expected, actual);
    }


}
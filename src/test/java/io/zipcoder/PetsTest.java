package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

public class PetsTest {
    Pet pet;
    String name;
    String call;


    public PetsTest(Pet expectedPet, String expectedSpeech, String expectedName) {
        this.pet = expectedPet;
        this.call = expectedSpeech;
        this.name = expectedName;
    }

    @Test
    public void thisPetInstanceOfPetTest() {
        Assert.assertTrue(pet instanceof Pet);
    }

    @Test
    public void petNameSetGetTest() {
        pet.setName(name);
        String expected = name;
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeakTest() {
        String expected = call;
        String actual = pet.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petToString() {
        pet.setName(name);

        String expected = "This pet is a " + pet.getClass().getSimpleName() + " named " + name + ", who goes " + call;
        String actual = pet.toString();

        Assert.assertEquals(expected, actual);
    }
}

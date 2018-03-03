package io.zipcoder.pets;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testConstructor(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Tina";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetName(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Tina";
        pet.setName(expected);
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetType(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Llama";
        String actual = pet.getType();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Llama";
        pet.setType(expected);
        String actual = pet.getType();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetSpeak(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Fat";
        pet.setType(expected);
        String actual = pet.getSpeak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetSpeak(){
        Pet pet = new Pet("Tina", "Llama", "Fat");
        String expected = "Fat";
        pet.setType(expected);
        String actual = pet.getSpeak();
        Assert.assertEquals(expected, actual);
    }

}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatClassTest {

    @Test
    public void testConstructorPetName() {
        // Given
        String expected = "Kitty";

        // When
        Pet testPet = new Pet(expected);

        // Then
        String actual = testPet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Cat catTest = new Cat();
        String expected = "Kerri";
        //When
        catTest.setName(expected);
        String actual = catTest.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Cat catTest = new Cat();
        String expected = "Meow";
        //When
        String actual = catTest.speak();
        //Then
        Assert.assertEquals(expected, actual);
    }
}

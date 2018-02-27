package io.zipcoder.pets;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat testCat = new Cat("Bubbles", 2);

    String name;
    int age;

    @Test
    public void setCatNameAndAgeTest (){
//        name = newName;
//        age = newage;
        String expectedName = "wrong";
        String actualName = testCat.getName();
        int expectedAge = 200;
        int actualAge = testCat.getAge();

        Assert.assertEquals(expectedName, expectedName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        Cat testCat = new Cat("Bubbles", 2);
        String expected = "wrong";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    Cat testCat = new Cat("Bubbles", 2);

    String name;
    int age;

    @Test
    public void setCatNameAndAgeTest (String newName, int newage){
        name = newName;
        age = newage;
        String expectedName = "";
        String actualName = testCat.getName();
        int expectedAge = 0;
        int actualAge = testCat.getAge();

        Assert.assertEquals(expectedName, expectedName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void speakTest(){
        Cat testCat = new Cat("Bubbles", 2);
        String expected = "";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }
}

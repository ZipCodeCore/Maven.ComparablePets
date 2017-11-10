package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void compareToTest_Type() throws Exception {
        Pet aDog = new Dog("billy");
        Pet aCat = new Cat("billy");
        int expected = 1;
        int actual = aDog.compareTo(aCat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compareToTest_Name() throws Exception {
        Pet aDog1 = new Dog("Brian");
        Pet aDog2 = new Dog("Brian");
        int expected = 0;
        int actual = aDog1.compareTo(aDog2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setGetName() throws Exception {
        String expected = "Brian";
        Pet myDog = new Dog("Brian");
        myDog.setName(expected);
        String actual = myDog.getName();
        Assert.assertEquals(expected, actual);
    }


}

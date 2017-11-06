package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pets;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {


    User testUser = new User("bob");
    Pets testdog = new Dog();
    Pets testcat = new Cat();
    ArrayList<Pets> testpetlist = new ArrayList <Pets>();



    @Test
    public void getPets() throws Exception {
        testUser.pets.add(testdog);

        String expected = "woof";
        ArrayList<Pets> userpets = testUser.getPets();
        String actual = userpets.get(0).speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPets() throws Exception {
        testUser.pets.add(testdog);

        int expected = 1;
        int actual = testUser.pets.size();

        Assert.assertEquals(expected,actual);

    }


    @Test
    public void getName() throws Exception {

        String expected = "bob";
        String actual = testUser.getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setName() throws Exception {

        testUser.setName("jim");
        String expected = "jim";
        String actual = testUser.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){

        testUser.pets.add(testdog);
        String expected = "bob has 1 pet(s).";
        String actual = testUser.tostring();

        Assert.assertEquals(expected,actual);


    }

}
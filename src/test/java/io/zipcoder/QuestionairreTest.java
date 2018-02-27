package io.zipcoder;

import io.zipcoder.Pets.Capybara;
import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionairreTest {
    Questionairre form;
    ArrayList<Pet> testList;
    Cat testCat;

    @Before
    public void setup(){
        form = new Questionairre();
        testList = new ArrayList<>();
        testCat = new Cat("testCat", 4);
    }

    @Test
    public void speakNSayTest(){
        form.petArrayList.add(testCat);
        String actual = form.speakNSay();
        String expected = "The Cat named testCat says Meow. ";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void petTypeSwitchTest(){
        form.petTypeSwitch("dog", "doug", 5);
        Pet expected = form.petArrayList.get(0);
        Assert.assertEquals(expected.getName(), "doug");
    }

    @Test
    public void petListSortByNameTest(){
        Dog doug = new Dog("doug", 3);
        Capybara captain = new Capybara("captain", 7);
        form.petArrayList.add(testCat);
        form.petArrayList.add(doug);
        form.petArrayList.add(captain);
        ArrayList<Pet> expected = new ArrayList<>();
        expected.add(captain);
        expected.add(doug);
        expected.add(testCat);
        ArrayList<Pet> actual = form.getPetArrayList();
        Collections.sort(actual, new SortByName());
        Assert.assertEquals(expected, form.getPetArrayList());
    }

    @Test
    public void petListSortByTypeTest(){
        Dog doug = new Dog("doug", 3);
        Capybara captain = new Capybara("captain", 7);
        form.petArrayList.add(testCat);
        form.petArrayList.add(doug);
        form.petArrayList.add(captain);
        ArrayList<Pet> expected = new ArrayList<>();
        expected.add(captain);
        expected.add(testCat);
        expected.add(doug);
        form.petListTypeSort();
        Assert.assertEquals(expected, form.getPetArrayList());
    }

}

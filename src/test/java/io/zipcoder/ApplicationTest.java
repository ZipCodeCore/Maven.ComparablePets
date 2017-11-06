package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Falcon;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ApplicationTest {

    ArrayList<Pet> pets = new ArrayList<>();

    String catName = "Mr. Mittens";
    String dogName = "Dog Jr.";
    String falconName = "Falco";

    Cat kitty = new Cat(catName);
    Cat jim = new Cat("Jim");
    Dog puppy = new Dog(dogName);
    Falcon peregrine = new Falcon(falconName);

    @Test
    public void getNameTest() {
        String expected = catName;

        String actual = kitty.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Dr, Chaos";

        puppy.setName(expected);

        String actual = puppy.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        peregrine.speak();
    }

    @Test
    public void sortTest_SameType() {
        pets.add(new Cat("Zzz"));
        pets.add(kitty);
        pets.add(jim);
        Collections.sort(pets);

        String expected = "[Jim, Mr. Mittens, Zzz]";

        String actual = pets.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest_DifferentType() {
        pets.add(peregrine);
        pets.add(puppy);
        pets.add(jim);
        pets.add(kitty);

        Collections.sort(pets);

        String expected = "[Jim, Mr. Mittens, Dog Jr., Falco]";

        String actual = pets.toString();

        Assert.assertEquals(expected, actual);
    }

}

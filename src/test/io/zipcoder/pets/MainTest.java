package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest {
@Test
    public void sortingTesComparable(){

    ArrayList<Pets> userPets = new ArrayList<Pets>();

    String expected="joe is Cat\njoe is Dog\njoe is Fish\nzebra is Cat\n";

    userPets.add(new Fish("joe"));
    userPets.add(new Dog("joe"));
    userPets.add(new Cat("joe"));
    userPets.add(new Cat("zebra"));

    String actual="";

    //Collections.sort(userPets);

    for (Pets pets : userPets)
        actual+=pets.getNames() + " is " + pets.getClass().getSimpleName()+"\n";

    Assert.assertEquals(expected, actual);
    }



    @Test
    public void sortingTestComparator(){

        ArrayList<Pets> userPets = new ArrayList<Pets>();

        userPets.add(new Fish("joe"));
        userPets.add(new Dog("joe"));
        userPets.add(new Cat("joe"));
        userPets.add(new Cat("zebra"));
        userPets.add(new Cat("ezekiel"));
        userPets.add(new Dog("jacob"));

String expected ="Cat is ezekiel\nCat is joe\nCat is zebra\nDog is jacob\nDog is joe\nFish is joe\n";
        Collections.sort(userPets, new TypeCompare());
String actual="";
        for (Pets pets : userPets) {
            actual+=pets.getClass().getSimpleName()+ " is "+pets.getNames() +"\n";;
        }
Assert.assertEquals(expected, actual);
    }
}
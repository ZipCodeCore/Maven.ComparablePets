package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PetsTest {

    @Test
    public void getName() {

        String expected = "Spot";
        Pets pet = new Dog("Spot");
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void comparableTest() {
        ArrayList<Pets> testing = new ArrayList<>();
        Snake Fage = new Snake("Fage");
        Cat Cheshire = new Cat("Cheshire");
        Dog Gretchen = new Dog("Gretchen");
        Snake Gretchen1 = new Snake("Gretchen");
        testing.add(Fage);
        testing.add(Cheshire);
        testing.add(Gretchen);
        testing.add(Gretchen1);

        Collections.sort(testing);
        Pets[] expected = {Cheshire, Fage, Gretchen, Gretchen1};
        Pets[] actual = testing.toArray(new Pets[testing.size()]);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void comparatorTest() {
        ArrayList<Pets> testing = new ArrayList<>();

        Snake Fage = new Snake("Fage");
        Cat Cheshire = new Cat("Cheshire");
        Dog Gretchen = new Dog("Gretchen");
        Snake Gretchen1 = new Snake("Gretchen");
        Snake Franky = new Snake("Franky");
        Cat Christian = new Cat("Christian");
        Dog Zim = new Dog("Zim");

        testing.add(Fage);
        testing.add(Cheshire);
        testing.add(Gretchen);
        testing.add(Gretchen1);
        testing.add(Franky);
        testing.add(Christian);
        testing.add(Zim);

        Pets[] expected = {Cheshire, Christian, Gretchen, Zim, Fage , Franky, Gretchen1};
        Collections.sort(testing, Zim);

        Pets[] actual = testing.toArray((new Pets[testing.size()]));
        Assert.assertEquals(expected, actual);
    }
}

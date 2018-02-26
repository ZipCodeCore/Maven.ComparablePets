package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Compare;
import io.zipcoder.Pets.Cow;
import io.zipcoder.Pets.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class ApplicationTest {

    Application app;
    Dog tester1;
    Dog tester4;
    Cat tester2;
    Cow tester3;

    @Before
    public void setup() {
        tester1 = new Dog();
        tester4 = new Dog();
        tester2 = new Cat();
        tester3 = new Cow();
        app = new Application();
    }

    @Test
    public void sortByNameTest() {

        tester1.setName("A");
        tester2.setName("B");
        tester3.setName("C");
        tester4.setName("D");

        app.petList.add(tester1);
        app.petList.add(tester2);
        app.petList.add(tester4);
        app.petList.add(tester3);

        Collections.sort(app.petList);

        String expected = "ABCD";

        String actual = "";
        for(int i = 0; i < app.petList.size(); i++) {
            actual += app.petList.get(i).getName();
        }
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sortByClassTest() {

        Compare compare = new Compare();

        tester1.setName("A");
        tester2.setName("B");
        tester3.setName("C");
        tester4.setName("D");

        app.petList.add(tester1);
        app.petList.add(tester2);
        app.petList.add(tester4);
        app.petList.add(tester3);

        Collections.sort(app.getPetList(), compare);
        String expected = "[B Meow, C Mooooooo, D Woof, A Woof]";
        String actual = app.getPetList().toString();
        Assert.assertEquals(expected, actual);
    }


}

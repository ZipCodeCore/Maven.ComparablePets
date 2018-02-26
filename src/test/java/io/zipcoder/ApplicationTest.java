package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.ComperatorForPets;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Snake;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;

public class ApplicationTest {

    public static void main(String[] args) {
        Application app = new Application();

        app.howManyPets();
        app.printListOfPets();
    }

    Application testApp = new Application();

    @Test
    public void sortByNameThenClass() {
        Cat cat = new Cat();
        cat.setName("Joe");
        Dog dog = new Dog();
        dog.setName("Brian");
        Snake snake = new Snake();
        snake.setName("April");
        Dog dog2 = new Dog();
        dog2.setName("April");

        testApp.setPetList(cat);
        testApp.setPetList(dog);
        testApp.setPetList(snake);
        testApp.setPetList(dog2);

        Collections.sort(testApp.getPetList());

        String expected = "[April Woof, April Hiss, Brian Woof, Joe Meow]";
        String actual = testApp.getPetList().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByClassThenName() {
        ComperatorForPets comperatorForPets = new ComperatorForPets();
        Cat cat = new Cat();
        cat.setName("Joe");
        Dog dog = new Dog();
        dog.setName("Brian");
        Snake snake = new Snake();
        snake.setName("April");
        Dog dog2 = new Dog();
        dog2.setName("April");

        testApp.setPetList(cat);
        testApp.setPetList(dog);
        testApp.setPetList(snake);
        testApp.setPetList(dog2);

        Collections.sort(testApp.getPetList(), comperatorForPets);

        String expected = "[Joe Meow, April Woof, Brian Woof, April Hiss]";
        String actual = testApp.getPetList().toString();

        Assert.assertEquals(expected, actual);
    }

}

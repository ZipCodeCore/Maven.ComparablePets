package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {


    @Test
    public void petListWithNameAndSoundTest() {
        Application app = new Application();
        Bird bird = new Bird("Joy");
        Cat cat = new Cat("Emerson");
        Dog dog = new Dog("Ripley");
        app.pets.add(bird);
        app.pets.add(cat);
        app.pets.add(dog);

        String expected= "Joy Sqwauk\nEmerson Meow\nRipley Bark";
        String actual=app.petListWithNameAndSound(app.pets);
    }
}
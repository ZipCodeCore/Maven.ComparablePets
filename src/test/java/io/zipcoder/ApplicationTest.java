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
        app.pets.add(bird);
        app.pets.add(cat);

        String expected= "Joy Sqwauk\nEmerson Meow";
        String actual=app.petListWithNameAndSound(app.pets);
    }
}
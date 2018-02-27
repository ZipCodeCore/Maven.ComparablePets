package io.zipcoder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
@Test
public void petNameAndSpeakTest() {

    Application app = new Application();
    Bird bird = new Bird("Ugly Bird");
    Cat cat = new Cat ("Fitzgerald");
    Dog dog = new Dog("Oreo");
    app.pets.add(bird);
    app.pets.add(cat);
    app.pets.add(dog);

    String expected = "Ugly Bird Squak\nFitzgerald Meow\nOreo Bark";
    String actual = app.petNameAndSpeak(app.pets);
}

}

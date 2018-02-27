package io.zipcoder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
@Test
    public void petsWithNamesAndSounds() {
    Application app = new Application();
    Bird Bird = new Bird("Ugly Bird");
    Cat cat = new Cat("Fitzgerald");
    Dog dog = new Dog("Oreo");

    String expected = "Oreo says, Woof\nUgly Bird says, Squak\nFitzgerald says, Meow\n";
    String actual = app.petInformation();
    Assert.assertEquals(expected, actual);
}

}

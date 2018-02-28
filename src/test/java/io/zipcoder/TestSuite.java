package io.zipcoder;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ApplicationTest.class,
        CatTest.class,
        DogTest.class,
        ElectricMouseTest.class,
        PetTest.class,
        TurtleTest.class
})
public class TestSuite {
}

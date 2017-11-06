package io.zipcoder;
import io.zipcoder.pet.*;
import org.junit.*;
import java.util.*;

public class petTest {
    Pet testPet = new Dog();
    Pet testPet1 = new Cat();
    ArrayList<Pet> pets = new ArrayList<>();

    @Test
    public void nameTest(){
        String expected = "doggy";
        testPet.setName("doggy");

        String actual = testPet.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest(){
        String expected = "woof";

        String actual = testPet.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        String expected = "billy is a dog and says woof.";
        testPet.setName("billy");

        String actual = testPet.toString();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void compareToTest(){
        testPet.setName("fred");
        testPet1.setName("bob");
        pets.add(testPet);
        pets.add(testPet1);
        String expected = "bob";

        Collections.sort(pets);
        String actual = pets.get(0).getName();

        Assert.assertEquals(expected,actual);

    }
}

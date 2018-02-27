package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class PetTest {

  @Test
  public void setNameTest() {
      //Given
      Dog dog = new Dog("Molly");

      //When
      String expected = "Molly";
      dog.setPetName(expected);
      String actual = dog.getName();

      //Then
      Assert.assertEquals(expected, actual);
  }

  @Test
    public void compareToTest() {
      //Given
      ArrayList<Pet> tempList = new ArrayList<>();
      Dog bun = new Dog("Bun");
      Dog mun = new Dog("Mun");
      Cat fun = new Cat("Fun");
      Cat hun = new Cat("Hun");
      Unicorn run = new Unicorn("Run");

      tempList.add(bun);
      tempList.add(mun);
      tempList.add(fun);
      tempList.add(hun);
      tempList.add(run);

      //When
      Pet[] expected = {bun, fun, hun, mun, run};
      Collections.sort(tempList);
      Pet[] actual = tempList.toArray(new Pet[tempList.size()]);

      //When
      Assert.assertTrue(Arrays.equals(expected,actual));

  }

  @Test
    public void compareTest(){
      //Given
      Application app = new Application();

      Dog bun = new Dog("Bun");
      Cat fun = new Cat("Fun");
      Unicorn run = new Unicorn("Run");
      Unicorn sun = new Unicorn("Sun");

      app.collectionOfPets.add(bun);
      app.collectionOfPets.add(fun);
      app.collectionOfPets.add(run);
      app.collectionOfPets.add(sun);

      //When
      Collections.sort(app.collectionOfPets,new PetCompare());
      Pet[] expected = {bun, fun, run, sun};
      Pet[] actual = app.collectionOfPets.toArray(new Pet[app.collectionOfPets.size()]);

      //When
      Assert.assertTrue(Arrays.equals(expected,actual));

  }
}
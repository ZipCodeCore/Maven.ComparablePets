package io.zipcoder;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Otter;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PetInventoryTest {

    PetInventory petListTest;

    @Before
    public void setup(){

        petListTest= new PetInventory();

    }

    @Test
    public void addPetTest(){
        Dog myDog = new Dog("Fighter");
        ArrayList<Pet>arrayListOfDogsTest = new ArrayList<Pet>();
        arrayListOfDogsTest.add(myDog);
        petListTest.pets.put("Dog",arrayListOfDogsTest);
        petListTest.addPet("Dog","Sparky");
        Pet expected = myDog;
        Pet actual = petListTest.pets.get("Dog").get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removePetTest(){
        Cat myCat = new Cat("Zina");
        Cat anotherCat = new Cat("Kitty");
        ArrayList<Pet>catsTest = new ArrayList<Pet>();
        catsTest.add(myCat);
        catsTest.add(anotherCat);
        petListTest.pets.put("Cat",catsTest);

        petListTest.removePet("kitty");

        int expected =1;
        int actual = petListTest.pets.get("Cat").size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public  void listPetsTest(){
        Cat myCat = new Cat("Zina");
        Otter myOtter = new Otter("Kitty");
        ArrayList<Pet>catsTest = new ArrayList<Pet>();
        ArrayList<Pet>otterTest = new ArrayList<Pet>();
        catsTest.add(myCat);
        otterTest.add(myOtter);

        petListTest.pets.put("Cat",catsTest);
        petListTest.pets.put("Kitty",otterTest);

        String expected = "Zina==>Meow\n"+
                "Kitty==>Muahaha";
        String actual = petListTest.listPets();

        Assert.assertEquals(expected,actual);


    }
  @Test
    public void getPetType(){
      Cat myCat = new Cat("Zina");
      Otter myOtter = new Otter("Kitty");
      ArrayList<Pet>catsTest = new ArrayList<Pet>();
      ArrayList<Pet>otterTest = new ArrayList<Pet>();
      catsTest.add(myCat);
      otterTest.add(myOtter);

      petListTest.pets.put("Cat",catsTest);
      petListTest.pets.put("Kitty",otterTest);

      String expected = "Cat";
      String actual  = petListTest.getPetType("Zina");

      Assert.assertEquals(expected,actual);

  }

  @Test

    public void listOfPetsByNameTest(){

      Dog myDog = new Dog("Fighter");
      ArrayList<Pet>arrayListOfDogsTest = new ArrayList<Pet>();
      arrayListOfDogsTest.add(myDog);

      Cat myCat = new Cat("Zina");
      Otter myOtter = new Otter("Kitty");
      ArrayList<Pet>catsTest = new ArrayList<Pet>();
      ArrayList<Pet>otterTest = new ArrayList<Pet>();
      catsTest.add(myCat);
      otterTest.add(myOtter);

      petListTest.pets.put("Cat",catsTest);
      petListTest.pets.put("Kitty",otterTest);
      petListTest.pets.put("Dog",arrayListOfDogsTest);

      ArrayList<String> expected = new ArrayList<String>();
      expected.add("Fighter");
      expected.add("Kitty");
      expected.add("Zina");

      ArrayList<String> actual = petListTest.listOfPetsByName();

      Assert.assertEquals(expected,actual);


  }



}

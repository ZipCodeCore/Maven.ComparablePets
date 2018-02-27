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
        petListTest.pets.put("dog", arrayListOfDogsTest);
        petListTest.addPet("dog","Sparky");
        int expected = 2;
        int actual = petListTest.pets.get("dog").size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removePetTest(){
        Cat myCat = new Cat("Zina");
        Cat anotherCat = new Cat("Kitty");
        ArrayList<Pet>catsTest = new ArrayList<Pet>();
        catsTest.add(myCat);
        catsTest.add(anotherCat);
        petListTest.pets.put("cat",catsTest);
        petListTest.removePet("Kitty");
        int expected = 1;
        int actual = petListTest.pets.get("cat").size();
        System.out.println(petListTest.listPets());
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

        petListTest.addPet("cat", "Zina");
        petListTest.addPet("otter", "Kitty");

        String expected = "Zina==>Meow!\n"+
                "Kitty==>Muahaha\n";

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

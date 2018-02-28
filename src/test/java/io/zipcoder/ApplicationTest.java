package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;
;


public class ApplicationTest {
    @Test
    public void testAddPets() {
        //Given
        Application application = new Application();
        Pet pet1 = new Cat();

        //When
        application.add(pet1);
        Pet[] petArray = application.getPets();

        //Then
        Pet firstPet = petArray[0];
        Assert.assertEquals(pet1, firstPet);
        }

     @Test
     public void testGetPets() {
     // Given
     Application application = new Application();
     Pet pet1 = new Dog();
     Pet pet2 = new Cat();
     Pet pet3 = new Reptile();
     Pet[] expectedPets = new Pet[]{pet1, pet2, pet3};

     application.add(pet1);
     application.add(pet2);
     application.add(pet3);

     // When
     Pet[] actualPets = application.getPets();

     // Then
     Assert.assertEquals(expectedPets, actualPets);
     }

    @Test
    public void testCreatePet() {
    //Given
    Application application = new Application();
    String petType = "Dog";
    String petName = "Milo";

    // When
    Pet pet = application.createPet(petType, petName);

    //Then
    Assert.assertTrue(pet instanceof Dog);
    }


}
















//    List<Pet> pets = new ArrayList<Pet>();
//
//    @Test
//    public void testPrintPetList() {
//        //Given
//        Application app = new Application();
//        //When
//        app.getPetInfo();
//        //Then
//        app.printPetList();
//
//        //Assert.assertEquals(null,null);
//
//    }
//
//
//    @Test
//    public void testPet() {
//        //Given
//        Pet p = new Pet("fido", "dog");
//        String expected = "fido dog";
//        //When
//        System.out.println(p.toString());
//        //Then
//        // expected.equals(p.toString());
//
//    }
//
//    @Test
//    public void testAddPet(){
//        Pet p = new Pet("amonnie", "reptile");
//
//        String expected = "amonnie reptile";
//
//        p.setPetName("amonnie");
//        p.setPetType("reptile");
//
////        String actual = p.getPetName();
////        String actual1 = p.getPetType();
////
////        Assert.assertEquals(expected, actual);
//
//    }
//
//
//
//
//
//
//    @Test
//    public void getNumOfPets() {
//        //Given
//
//        //When
//        //Then
//
//
//    }
//
//    @Test
//    public void getPetType() {
//    }
//
//    @Test
//    public void getPetName(){
//
//    }
//
//    @Test
//    public void viewPetList() {
//    }
//}

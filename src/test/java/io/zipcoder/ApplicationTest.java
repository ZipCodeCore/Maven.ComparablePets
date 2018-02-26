package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class ApplicationTest {
    Application application = new Application();

    @Test
    public void welcomeUserTest() {

        //This part is just setting the outputStream object to whatever is set in the method inside the application class
        //For example, if System.out.println("Hello"); then outputStream is equal to "Hello"
        //Thus, a unit test will make sure String expected = "Hello"; is equal to outputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        //Calls the method welcomeUser() which takes in no argument and return type void
        //Method just prints out the welcome message
        application.welcomeUser();

        //Expected Welcome Message
        String expected =
                "******************** WELCOME PET OWNER **********************\n" +
                        "We will be asking you a couple of questions about your pets.\n" +
                        "No need to worry. We won't be doing anything sketchy with\n" +
                        "this info. Your pet info is safe with us :)    \n\n";
        //when putting it into the app class, take out the last "\n"

        //Comparison
        Assert.assertEquals(expected, outputStream.toString());
    }


    @Test
    public void addPetInfoToListTestType1(){
        //This part is just setting the inputStream object to whatever is set in the scanner inside the method
        //For example, if the inputStream = "hi" then Scanner.nextLine() = "hi";
        //Thus, a unit test will make sure String expected = "hi"; is equal to return type
        String in = "Dog";
        InputStream input = new ByteArrayInputStream(in.getBytes());
        System.setIn(input);

        String actual = application.getTypeOfPet(); //method will be in the addPetInfoToList() method

        String expected = "Dog";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addPetInfoToListTestType2(){
        String in = "Cat";
        InputStream input = new ByteArrayInputStream(in.getBytes());
        System.setIn(input);

        String actual = application.getTypeOfPet(); //method will be in the addPetInfoToList() method

        String expected = "Cat";

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addPetInfoToListTestName(){
        String in = "Sally";
        InputStream input = new ByteArrayInputStream(in.getBytes());
        System.setIn(input);

        String actual = application.getNameOfPet();

        String expected = "Sally";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void fillList(){
        String type = "Cat";
        String name = "Sally";

        ArrayList<Object> petList = application.fillList(type, name);//fills the list with objects depending on the input
        //three types: Cat, Dog, Turtle

        Assert.assertNotEquals(null, petList);
    }

    @Test
    public void sortList(){
        //just filling an array list
        String type = "Cat";
        String name = "Sally";
        String type2 = "Dog";
        String name2 = "Bob";

        ArrayList<Object> petList = application.fillList(type, name);
        petList.add(application.fillList(type2, name2));

        //start of real test with sorting the created ArrayList
        ArrayList<Object> petListSorted = application.sortList(petList);

        //two tests to make sure ArrayList is not null and that the sorted list isn't equal to the original list
        Assert.assertNotEquals(null, petListSorted);
        Assert.assertNotEquals(petList, petListSorted);
    }
}

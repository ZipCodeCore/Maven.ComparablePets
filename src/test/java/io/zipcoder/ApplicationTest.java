package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class ApplicationTest {

    Scanner scanner = new Scanner(System.in);



    @Test
    public void howManyPets(){


    }
    @Test
    public void whatKindOfPet(){

    }

    @Test
    public void speak(){
        //Given
        Llama llama = new Llama();
        String speak = "";
        //When



        //Then
       Assert.assertEquals(llama.speak, speak);


    }

    @Test
    public void checkingTheInstance(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Pets);
    }




}

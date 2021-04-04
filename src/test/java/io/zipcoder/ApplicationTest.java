package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class ApplicationTest {
    Scanner scn = new Scanner(System.in);
    @Test
    public void howManyPets(){

    }
    @Test
    public void whatKindOfPet(){


    }
    @Test
    public void speak(){
        //Given
        Koala k = new Koala();
        String speak = "";
        //When
        //Then
        Assert.assertEquals(k.speak, speak);




    }

    @Test
    public void checkingTheInstance(){
        Koala koala = new Koala();
        Assert.assertTrue(koala instanceof Pets);
    }


}

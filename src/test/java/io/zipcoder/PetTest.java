package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * created by Frankie on 02/26/18
 */
public class PetTest {

    /**
     * the pet class should be abstract and implement the Animal interface
     *
     * Should feature a null constructor that defaults name = "";
     * and feature a name constructor that sets this.name = name;
     */
    Pet pet;
    Dog dog;
    Cat cat;
    Turtle turtle;
    ElectricMouse electricMouse;

    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void testImplementation() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Animal);
    }

    @Test
    public void GetNameTest1(){
        String name = "Andy";
        pet = new Dog(name);

        String nameReturn = pet.getName();
        Assert.assertEquals(nameReturn, name);
    }

    @Test
    public void GetNameTest2(){
        String name = "Gloria";
        pet = new Dog(name);

        String nameReturn = pet.getName();
        Assert.assertEquals(nameReturn, name);
    }

}

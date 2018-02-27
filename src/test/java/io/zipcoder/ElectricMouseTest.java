package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElectricMouseTest {
    ElectricMouse electricMouse;
    /**
     * the electricMouse class should extend the Pet class
     * Should feature a null constructor that defaults name = "";
     * and feature a name constructor that sets this.name = name;
     */

    @Before
    public void instantiateElectricMouse() {
        String name = "Pikachu";
        electricMouse = new ElectricMouse(name);
    }

    @Test
    public void speakTest() {
        String response = electricMouse.speak();
        String expected = "PIKACHUUUUUUUU!";
        Assert.assertEquals(expected, response);
        /* looks something like:
        public String speak() {
        Animal electricMouse = new Animal() {
            @Override
            public String speak() {
                return "Meow";
            }
        };
        return electricMouse.speak();
    }
         */
    }


    @Test
    public void getNameTest1(){
        String actual = electricMouse.getName();
        String expected = "Pikachu";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest2(){
        electricMouse = new ElectricMouse();
        String actual = electricMouse.getName();
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}

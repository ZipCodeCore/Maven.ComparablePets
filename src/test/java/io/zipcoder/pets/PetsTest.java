package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {
    @Test
    public void getNameTest1() {
        Dog doge = new Dog("Unicycle");
        doge.setName("Bicycle");
        String actual = doge.getName();
        String expected = "Bicycle";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest2() {
        Dog doge = new Dog("Beebo");
        doge.setName("Orange");
        String actual = doge.getName();
        String expected = "Orange";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNameTest3() {
        Dog doge = new Dog("Beebo");
        doge.setName("Corg");
        String actual = doge.getName();
        String expected = "Orange";
        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void getTypeTest1() {
        Cat cat = new Cat("Fred");
        cat.setType("Froilan");
        String actual = cat.getType();
        String expected = "Froilan";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTypeTest2() {
        Cat cat = new Cat("Doc");
        cat.setType("cat");
        String actual = cat.getType();
        String expected = "cat";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTypeTest3() {
        Dog doge = new Dog("Unicycle");
        doge.setType("dog");
        String actual = doge.getType();
        String expected = "dog";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeak1() {
        Dog doge = new Dog("Yeller");
        String actual = doge.speak();
        String expected = "Wooooooof!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeak2() {
        Cat cat = new Cat("Jenkins");
        String actual = cat.speak();
        String expected = "Mow mow...";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeak3() {
        Fish fish = new Fish("Ribbers");
        String actual = fish.speak();
        String expected = "Glub glub...";
        Assert.assertEquals(expected, actual);
    }
}

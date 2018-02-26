package io.zipcoder.pets;

import io.zipcoder.Fish;
import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void fishSpeakTest(){
        Fish fish = new Fish("Malcolm");
        String sound = "Blub blub";
        String expected = sound;
        String actual = fish.speak();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void fishNameTest(){
        Fish fish = new Fish("Malcolm");
        String name = "Malcolm";
        String expected = name;
        String actual = fish.getName();
        Assert.assertEquals(expected, actual);
    }
}

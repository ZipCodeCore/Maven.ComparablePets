package io.zipcoder.pets;
import org.junit.*;


public class TariqTest {

    @Test
    public void testSpeak(){
        Tariq tariq = new Tariq("Rhino");
        String expected = " says 'Das disrespectful!!!'";
        String actual =  tariq.speak();
        Assert.assertEquals(expected, actual);

    }

}

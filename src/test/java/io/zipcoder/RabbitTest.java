package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class RabbitTest {
    @Test
    public void testUhhhRabbitSoundsIDK() {
        Pet rabbit = new Rabbit();
        rabbit.setName("Bugs");
        String expected = "What's up, Doc?";
        String actual = rabbit.speak();

        Assert.assertEquals(expected, actual);
    }
}

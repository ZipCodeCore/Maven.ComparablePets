package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ApplicationTest {

    @Test
    public void getPetArrayListTest() {
        Application application = new Application();
        ArrayList expected = new ArrayList();
        ArrayList actual = application.getPetArrayList();
        Assert.assertEquals(expected, actual);
    }

}

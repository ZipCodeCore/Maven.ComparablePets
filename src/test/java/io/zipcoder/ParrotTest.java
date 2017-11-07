package io.zipcoder;
import org.junit.Test;

public class ParrotTest extends io.zipcoder.PetsTest {
    Pet pet;
    String name = "Polly";
    String call = "Polly wanna cracker!";


    public ParrotTest() {
        super(new Parrot(), "Polly wanna cracker!", "Polly");
    }


}

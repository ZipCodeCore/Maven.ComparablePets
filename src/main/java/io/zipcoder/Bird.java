package io.zipcoder;

public class Bird extends Pets{
    public Bird(String speak, String name) {
        super(speak, name);
    }

    //@Override
    public void speak() {
        String speak = "chirp";
        System.out.println(speak);
    }
}

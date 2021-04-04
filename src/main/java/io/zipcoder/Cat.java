package io.zipcoder;

public class Cat extends Pets{
    public Cat(String speak, String name) {
        super(speak, name);
    }

    public Cat() {

    }

    //@Override
    public void speak() {
        String speak = "meow";
        System.out.println(speak);
    }
}

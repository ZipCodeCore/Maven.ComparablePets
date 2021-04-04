package io.zipcoder;

public class Dog extends Pets{
    public Dog(String speak, String name) {
        super(speak, name);
    }

    //@Override
    public void speak() {
        String speak = "woof";
        System.out.println(speak);
    }


}

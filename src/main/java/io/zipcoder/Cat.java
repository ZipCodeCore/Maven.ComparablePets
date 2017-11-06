package io.zipcoder;

public class Cat extends Pet{
//
//    public Cat(String name) {
//        super(name);
//    }

    @Override
    public String speak() {
        return "meow";
    }

    public String toString() {
        return name+" is a cat and says "+speak()+".";
    }
}

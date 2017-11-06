package io.zipcoder.pet;

public class Cat extends Pet {
    @Override
    public String speak() {
        return "meow";
    }

    public String toString() {
        return name+" is a cat and says "+speak()+".";
    }
}

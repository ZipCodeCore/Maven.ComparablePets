package io.zipcoder.pet;

public class Dog extends Pet {
    @Override
    public String speak() {
        return "woof";
    }

    public String toString() {
        return name+" is a dog and says "+speak()+".";
    }
}

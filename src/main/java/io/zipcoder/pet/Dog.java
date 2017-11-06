package io.zipcoder.pet;

import io.zipcoder.pet.Pet;

public class Dog extends Pet {


//    public Dog(String name) {
//        super(name);
//    }

    @Override
    public String speak() {
        return "woof";
    }

    public String toString() {
        return name+" is a dog and says "+speak()+".";
    }
}

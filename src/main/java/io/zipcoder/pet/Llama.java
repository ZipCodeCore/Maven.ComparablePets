package io.zipcoder.pet;

import io.zipcoder.pet.Pet;

public class Llama extends Pet {

//    public Llama(String name) {
//        super(name);
//    }

    @Override
    public String speak() {
        return "weeshnaw";
    }

    public String toString() {
        return name+" is a llama and says "+speak()+".";
    }
}

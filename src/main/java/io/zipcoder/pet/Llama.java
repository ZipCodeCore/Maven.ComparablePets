package io.zipcoder.pet;

public class Llama extends Pet {
    @Override
    public String speak() {
        return "*spit*";
    }

    public String toString() {
        return name+" is a llama and says "+speak()+".";
    }
}

package io.zipcoder.pets;

public class Dog extends Pets {

    public Dog(String name){
        super(name, "dog");
    }
    public String speak() {
        return "Wooooooof!";
    }
}

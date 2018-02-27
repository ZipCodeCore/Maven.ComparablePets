package io.zipcoder.Pets;

public class Cat extends Pet {

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "Meow";
    }
}

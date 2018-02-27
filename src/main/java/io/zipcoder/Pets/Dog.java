package io.zipcoder.Pets;

public class Dog extends Pet {

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "Woof";
    }

}

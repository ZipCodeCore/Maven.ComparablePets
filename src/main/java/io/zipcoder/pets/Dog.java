package io.zipcoder.pets;

public class Dog extends Pets {


    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "woof woof!";
    }

}

//compareTo -> compares the values of two objects
//compare -> compares values and returns an int

//.getClass
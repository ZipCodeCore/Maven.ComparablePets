package io.zipcoder;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);

    }


    @Override
    public String speak() {

        return "meow";
    }

}

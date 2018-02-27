package io.zipcoder;

public class Cat extends Pets {

    public Cat(){}

    public Cat(String name) {
        super(name);
    }

    public void setName(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return this.name;
    }

    public String speak() {
        return "Hang in there.";
    }
}

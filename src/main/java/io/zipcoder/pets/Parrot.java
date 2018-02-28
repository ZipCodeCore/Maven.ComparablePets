package io.zipcoder.pets;

public class Parrot extends Pets {

    private String name;

    public Parrot() {
        this.name = name;
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String speak() {
        return "Hello";
    }


}

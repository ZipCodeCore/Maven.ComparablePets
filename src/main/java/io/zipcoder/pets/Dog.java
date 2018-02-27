package io.zipcoder.pets;

public class Dog extends Pets {

    private String name;

    public Dog() {
        this.name = name;
    }

    public Dog(String name) {
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
        return "Woof";
    }
}

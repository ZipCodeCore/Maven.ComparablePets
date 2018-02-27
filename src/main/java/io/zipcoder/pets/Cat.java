package io.zipcoder.pets;

public class Cat extends Pets {

    private String name;

    public Cat() {
        this.name = name;
    }

    public Cat(String name) {
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
    public String speak(){
        return "Meow";
    }
}

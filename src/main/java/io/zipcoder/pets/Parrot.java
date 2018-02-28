package io.zipcoder.pets;

public class Parrot extends Pets {

    private String name;
    private String type;

    public Parrot() {
        this.name = name;
        this.type = "parrot";
    }

    public Parrot(String name) {
        super(name);
        this.type = "parrot";
    }

    @Override
    public void setType() {
        this.type = "parrot";
    }
    @Override
    public String getType() {
        return type;
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

package io.zipcoder.pets;

public class Parrot extends Pets {


    private String type;

    public Parrot() {
        this.type = "parrot";
    }

    public Parrot(String name) {
        super(name);
        this.type = "parrot";
    }


    public void setType(String type) {
        this.type = "parrot";
    }

    public String getType() {
        return type;
    }


    @Override
    public String speak() {
        return "Hello";
    }


}

package io.zipcoder.pets;

public class Cat extends Pets {

    private String type;

    public Cat(String name) {
        super(name);
        this.type = "cat";
    }


    public void setType(String type) {
        this.type = "cat";
    }

    @Override
    public String getType(){
        return this.type;
    }


    @Override
    public String speak(){
        return "Meow";
    }
}

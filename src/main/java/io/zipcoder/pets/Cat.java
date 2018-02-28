package io.zipcoder.pets;

public class Cat extends Pets {

    private String name;
    private String type;

    public Cat() {
        this.name = name;
        this.type = "cat";
    }

    public Cat(String name) {
        super(name);
        this.type = "cat";
    }

    @Override
    public void setType() {
        this.type = "cat";
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
    public String speak(){
        return "Meow";
    }
}

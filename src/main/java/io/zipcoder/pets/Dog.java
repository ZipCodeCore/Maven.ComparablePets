package io.zipcoder.pets;

public class Dog extends Pets {

    private String name;
    private String type;

    public Dog() {
        this.name = name;
        this.type = "dog";
    }

    public Dog(String name) {
        super(name);
        this.type = "dog";
    }

    @Override
    public void setType(String type) {
        this.type = "dog";
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
        return "Woof";
    }
}

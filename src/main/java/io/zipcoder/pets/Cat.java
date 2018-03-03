package io.zipcoder.pets;

public class Cat extends Pet{

    private String name;
    private String speak;
    private String type;

    public Cat(String name, String speak, String type) {
        super(name, speak, type);
        this.name = name;
        this.speak = speak;
        this.type = type;
    }
    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getSpeak() {
        return speak;
    }
    @Override
    public void setSpeak(String speak) {
        this.speak = speak;
    }
}

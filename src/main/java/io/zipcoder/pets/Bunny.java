package io.zipcoder.pets;

public class Bunny extends Pet {

    private String name;
    private String speak;

    public Bunny(String name, String type, String speak) {
        super(name, type, speak);
        this.name = name;
        this.speak = speak;
    }

    public String getName() {
        return name;
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

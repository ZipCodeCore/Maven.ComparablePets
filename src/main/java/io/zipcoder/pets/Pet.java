package io.zipcoder.pets;

public class Pet {

    private String name;
    private String type;
    private String speak;

    public Pet(String name, String type, String speak) {
        this.name = name;
        this.speak = speak;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }



}

package io.zipcoder.pets;

public class Dog extends Pet {

    private String name;
    private String speak;
    private String type;

    public Dog(String name, String speak, String type) {
        super(name, speak, type);
        this.name = name;
        this.speak = speak;
        this.type = type;
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
    public void setSpeak(String speak){
        this.speak = speak;
    }

}

package io.zipcoder.pets;

public abstract class Pets {
    private String name;
    private String type;


    public Pets(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String name(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    abstract public String speak();



}


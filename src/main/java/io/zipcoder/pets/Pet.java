package io.zipcoder.pets;

abstract public class Pet {
    private String name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }



}

package io.zipcoder.pets;

public class Cat extends Pet {

    private String name;

    public Cat (String catName) {
        this.name = catName;
    }

    public String speak(){
        return "Meow";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String catName) {
        this.name = catName;
    }
}

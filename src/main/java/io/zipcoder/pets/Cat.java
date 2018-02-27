package io.zipcoder.pets;

public class Cat extends Pet {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }


    public String speak() {

        return "Meow!";
    }

    public void setName(String aCatName) {
        this.catName=aCatName;

    }

    public String getName() {

        return this.catName;
    }


}

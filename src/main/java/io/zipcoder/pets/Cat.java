package io.zipcoder.pets;

public class Cat extends Pet {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }


    public String speak() {

        return "Meow!";
    }

    public void setCatName(String aCatName) {
        this.catName=aCatName;

    }

    public String getCatName() {

        return this.catName;
    }


}

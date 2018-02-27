package io.zipcoder.pets;

public class Dog extends Pet {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }



    public String speak(){
    return "Woof!";
    }

    public void setName(String aDogName) {
        this.dogName = aDogName;
    }

    public String getName() {

        return dogName;
    }




}

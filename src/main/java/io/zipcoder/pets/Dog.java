package io.zipcoder.pets;

public class Dog extends Pet {
    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }



    public String speak(){
    return "Woof!";
    }

    public void setDogName(String aDogName) {
        this.dogName = aDogName;
    }

    public String getDogName() {

        return dogName;
    }




}

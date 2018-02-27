package io.zipcoder.pets;

public class Kangaroo extends Pet{

    private String name;

    public Kangaroo(String name) {
        super(name);
    }

    public Kangaroo(){

    }

    public String speak(){
        return "Get Krunk!!!";
    }
}

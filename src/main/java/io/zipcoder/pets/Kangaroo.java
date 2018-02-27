package io.zipcoder.pets;

public class Kangaroo extends Pet{

    public Kangaroo(){

    }

    public Kangaroo(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Get Krunk!";
    }

}

package io.zipcoder;

public class Cat extends Pet{
    public Cat(){

    }
    public Cat(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Meow";
    }
}

package io.zipcoder.pets;

public class Fish extends Pets{

    public Fish(String name){
        super(name,"fish");
    }

    public String speak() {
        return "Glub glub...";
    }
}

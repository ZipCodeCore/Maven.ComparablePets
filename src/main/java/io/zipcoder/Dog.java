package io.zipcoder;

public class Dog extends Pets{
    String speak = "";
    public String speak(){
        speak = "bark";
        System.out.println(speak);
        return speak;
    }
}

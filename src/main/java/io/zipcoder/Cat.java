package io.zipcoder;

public class Cat extends Pets{
    String speak = "";
    public String speak(){
        speak = "meow";
        System.out.println(speak);
        return speak;
    }
}

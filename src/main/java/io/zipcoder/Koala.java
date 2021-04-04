package io.zipcoder;

public class Koala extends Pets{
    String speak = "";
    @Override
    public String speak() {
        speak = "krrr";
        System.out.println(speak);
        return speak;
    }
}

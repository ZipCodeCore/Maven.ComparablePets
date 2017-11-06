package io.zipcoder.pets;

public class Llama extends Pets{

    @Override
    public String speak(){
        return "weeShnaw";
    }

    @Override
    public String tostring() {
        return name + " is a Llama and says " + speak();
    }
}

package io.zipcoder.pets;

public class Cat extends Pets{



    @Override
    public String speak(){
        return "meow";
    }

    @Override
    public String tostring() {
        return name + " is a Cat and says " + speak();
    }
}

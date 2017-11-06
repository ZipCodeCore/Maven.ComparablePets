package io.zipcoder.pets;

public class Dog extends Pets{


    @Override
    public String speak(){
       return "woof";
    }

    @Override
    public String tostring() {
        return name + " is a Dog and says " + speak();
    }


}

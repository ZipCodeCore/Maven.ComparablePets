package io.zipcoder;

public class Dog extends Pet{
    public Dog(){

    }
    public Dog(String name){
       super(name);
    }

    //method
    @Override
    public String speak(){
        String sound = "Woof";
        return sound;
    }

}

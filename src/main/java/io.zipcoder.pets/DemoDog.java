package io.zipcoder.pets;

public class DemoDog extends Pet{
    public DemoDog(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Screech";
    }
}
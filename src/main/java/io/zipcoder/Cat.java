package io.zipcoder;

public class Cat extends Pet implements Comparable<Pet> {

    public Cat(){}
    public Cat (String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Meow";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}

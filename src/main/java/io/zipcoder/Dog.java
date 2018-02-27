package io.zipcoder;

public class Dog extends Pet implements Comparable<Pet>{

    public Dog(){}
    public Dog (String name){
        super(name);
    }
    @Override
    public String speak(){
        return "Woof";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}

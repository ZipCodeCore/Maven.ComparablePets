package io.zipcoder;

public class Bird extends Pet implements Comparable<Pet>{

    public Bird(){}
    public Bird (String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Chirp";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}

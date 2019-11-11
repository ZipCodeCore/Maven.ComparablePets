package io.zipcoder.pets;

public class Cat extends Pet implements Comparable<Pet>{

    public Cat (String name){
        super.setName(name);
        super.setPetType("Cat");
    }

    public Cat(){
        super.setName("No name cat");
        super.setPetType("Cat");
    }

    public String speak(){
        return "meow";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}

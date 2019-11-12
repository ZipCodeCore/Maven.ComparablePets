package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog (String name){
        super.setName(name);
        super.setPetType("Dog");
    }

    public Dog (){
        super.setPetType("Dog");
        super.setName("No name dog");
    }

    public String speak(){
        return "Woof";
    }

    public int compareTo(Pet o) {
        return 0;
    }
}


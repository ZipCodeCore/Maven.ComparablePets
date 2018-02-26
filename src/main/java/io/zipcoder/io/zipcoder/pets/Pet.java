package io.zipcoder.io.zipcoder.pets;

public abstract class Pet {
    String name;
    int age;

    public Pet(String name, int age){
        name = name;
        age = age;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String speak(){
        return "";
    }
}

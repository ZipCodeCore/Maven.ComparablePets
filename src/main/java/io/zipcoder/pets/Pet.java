package io.zipcoder.pets;

public abstract class Pet implements Comparable<Pet> {
    protected String name;
    protected Integer age;

    public Pet(String name, int age){
        this.name = name;
        this.age = null;
    }

    public Integer getAge(){
        return null;
    }

    public void setAge(int newAge){

    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
    }

    public String speak(){
        return null;
    }
}

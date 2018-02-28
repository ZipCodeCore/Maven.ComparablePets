package io.zipcoder;

public class Cat extends Pet implements Animal{
    private String name;
    private Cat cat;

    public Cat() {
        this.name = "";
    }

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
     Animal cat = new Animal() {
         public String speak() {
             return "Meow (ever so softly)";
         }
     };
     return cat.speak();
    }
}

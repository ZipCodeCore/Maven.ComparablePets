package io.zipcoder.Pets;

public class Capybara extends Pet{

    public Capybara(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "It's me, the Capybara";
    }

}

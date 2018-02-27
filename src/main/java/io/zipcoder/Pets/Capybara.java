package io.zipcoder.Pets;

public class Capybara implements Pet {

    public String name;
    public Integer age;

    public Capybara(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        return "It's me, the Capybara";
    }
}

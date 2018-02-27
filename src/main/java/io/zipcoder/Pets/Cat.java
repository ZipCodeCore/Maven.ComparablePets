package io.zipcoder.Pets;

public class Cat implements Pet {

    public String name;
    public Integer age;

    public Cat(String name, int age){
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

    }

    public void setAge(int age) {

    }

    public String speak() {
        return "Meow";
    }
}

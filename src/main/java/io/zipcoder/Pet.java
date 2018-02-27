package io.zipcoder;

public abstract class Pet implements Animal {
    private Integer age = 0;
    private String name;

    public static void main(String[] args) {

    }


    public Pet() {

    }

    public Pet(String name) {
        this.name = name;
    }

    public Pet(int age) {
        this.age = age;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
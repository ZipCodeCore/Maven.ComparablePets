package io.zipcoder;

public class Dog extends Pet implements Animal{
    private String name;
    private Dog dog;

    public Dog() {
        this.name = "";
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        Animal dog = new Animal(){
            public String speak() {
                return "Woof!";
            }
        };
        return dog.speak();
    }
}

package io.zipcoder;

public class Cat extends Pet {
    String name;
    String type;

    public Cat() {
        this.name = "";
        this.type = "Cat";
    }

    public Cat(String name) {
        setPetName(name);
        this.type = "Cat";
    }

    @Override
    public String getType() {
        return type;
    }

    public void setPetName(String name) {
        this.name = name;
    }

    public String getPetName() {
        return this.name;
    }

    public String speak() {
        Animal dog = new Animal() {
            public String speak() {
                return "Meow";
            }
        };
        return dog.speak();
    }
}

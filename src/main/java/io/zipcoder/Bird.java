package io.zipcoder;

public class Bird extends Pet {
    String bird;
    String type;

    public Bird() {
        this.bird = "";
        this.type = "Bird";
    }

    public Bird(String name) {
        setPetName(name);
        this.type = "Bird";
    }

    @Override
    public String getType() {
        return type;
    }

    public void setPetName(String word) {
        this.bird = word;
    }

    public String getPetName() {
        return this.bird;
    }

    public String speak() {
        Animal dog = new Animal() {
            public String speak() {
                return "Squawk";
            }
        };
        return dog.speak();
    }
}

package io.zipcoder;
/**
 * Edited by Frankie
 */
public class Dog extends Pet {
    String name;
    String type;
    public Dog(){
        this.name = "";
        this.type = "Dog";
    }
    public Dog(String name){
        setPetName(name);
        this.type = "Dog";
    }

    @Override
    public String getType() {
        return type;
    }

    public void setPetName(String name){
        this.name = name;
    }

    public String getPetName() {
        return name;
    }

    public String speak() {
        Animal dog = new Animal() {
            public String speak() {
                return "I just met you and I love you!";
            }
        };
        return dog.speak();
    }
}

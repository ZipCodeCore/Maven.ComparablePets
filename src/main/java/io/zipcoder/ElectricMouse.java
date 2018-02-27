package io.zipcoder;

public class ElectricMouse extends Pet implements Animal{
    private String name;
    private ElectricMouse electricMouse;

    public ElectricMouse() {
        this.name = "";
    }

    public ElectricMouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        Animal electricMouse = new Animal() {
            public String speak() {
                return "PIKACHUUUUUUUU!";
            }
        };
        return electricMouse.speak();
    }
}

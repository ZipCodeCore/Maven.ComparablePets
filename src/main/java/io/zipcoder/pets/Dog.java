package io.zipcoder.pets;

public class Dog extends Pet {

    private String name;

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return super.speak();
    }

    public String chaseTailCertainNumberOfTimes(int timesToChaseTail) {
        // Will return 'chased tail int number of times'
        return null;
    }

}

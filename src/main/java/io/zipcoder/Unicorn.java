package io.zipcoder;

public class Unicorn extends Pet {
    private String petName;

    public Unicorn(String petName) {
        this.petName = petName;

        }

        public String getName() {

        return this.petName;
        }


    @Override
    public String speak() {
        return "sparkles glitter";
    }


}

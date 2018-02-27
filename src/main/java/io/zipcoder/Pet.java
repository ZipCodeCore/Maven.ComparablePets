package io.zipcoder;

public abstract class Pet implements Animal {
    private final String name;

    public Pet(String petName) {
        this.name = petName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        Class petClass = this.getClass();
        String petType = petClass.getSimpleName();

        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------------------");
        sb.append("\nPet type = " + petType);
        sb.append("\nPet name = " + this.name);
        return sb.toString();
    }
}
package io.zipcoder;
/**
 * Edited by Frankie
 */
public abstract class Pet implements Animal {
    String name;
    String type;

    public Pet() {
        this.name = "";
        this.type = "";
    }

    public void setPetName(String petName) {
        this.name = petName;
    }

    public String getPetName() {
        return this.name;
    }

    public void setPetType(String petType) {
        this.type = petType;
    }

    public String getType() {
        return type;
    }
}

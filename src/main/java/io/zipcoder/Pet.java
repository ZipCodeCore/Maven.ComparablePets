package io.zipcoder;

public abstract class Pet {
    // Since the Petclass has an abstract method , needed to declare this class abstract.

    //Instance Variable
    String name;
    //Constructor
    public Pet(String name) {
        //this key word means it is referring to string name.
        this.name = name;
    }
    //Getter retrieves info from instance variable
    public String getName() {
        return name;
    }
    // setter updates the value of a variable
    public void setName(String name) {
        this.name = name;
    }
    // The pet class must have a speak method that each subclass overrides
    // All child classes should override this method. There is no point to implement this method in a parent class.
    //making this method abstract will force subclasses to implement this method.
    public abstract String speak();


}

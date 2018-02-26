package io.zipcoder.Pets;

public class Pet implements Comparable<Pet> {

    private String name;

    public String speak() {
        return "Animal sounds";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Pet petToCompareAgainst) {
        String comparableName = petToCompareAgainst.getName();
        Class comparableClass = petToCompareAgainst.getClass();
        String comparableClassName = comparableClass.getName();

        Class myClass = this.getClass();
        String myClassName = myClass.getName();

        int result = comparableName.compareTo(this.getName());
        boolean sameName = (result == 0);

        int sameClassResult  = comparableClassName.compareTo(myClassName);

        if(sameName) {
            return sameClassResult;
        }
        return result * -1;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.speak();
    }

}

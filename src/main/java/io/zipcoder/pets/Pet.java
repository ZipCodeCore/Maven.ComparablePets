package io.zipcoder.pets;



public class Pet implements Comparable<Pet>{
    private String name;


    public String speak(){
        return "I am a pet.";
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int compareTo(Pet petToCompareAgainst) {
        Boolean condition1 = this.getName().equals(petToCompareAgainst.getName());
        int result = this.getName().compareTo(petToCompareAgainst.getName());
        int resultOfClassComaparison =
                this.getClass().getSimpleName().compareTo(petToCompareAgainst.getClass().getSimpleName());
        if (condition1) {
            return resultOfClassComaparison;
        } else {
            return result;
        }
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.speak();
    }

}
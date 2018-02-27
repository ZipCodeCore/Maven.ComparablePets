package io.zipcoder;

public class Pet implements Comparable<Pet>{
private String petName;


    //constructors
    public Pet(){

    }
    public Pet (String petName){
        this.petName = petName;
    }

    //methods
    public String getPetName(){
          return this.petName;
      }

    public void setPetName(String petName){
         this.petName = petName;
    }

    public String speak(){
        String sound = "Generic Animal Sound";
         return sound;
    }

    public int compareTo(Pet o) {
        return this.getPetName().compareToIgnoreCase(o.getPetName());
    }
}

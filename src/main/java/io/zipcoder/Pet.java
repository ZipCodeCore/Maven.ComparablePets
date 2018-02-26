package io.zipcoder;

public abstract class Pet implements Comparable<Pet>{
    public String name;

    public Pet(String name){
        this.name = name;
    }

    public abstract String speak();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getSimpleName() + " : " + this.getName());
        return builder.toString();
    }
    public int compareTo(Pet p) {
       int compareName = this.getName().compareTo(p.getName());
       if (compareName == 0){
          return this.getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
       }
       return compareName;
    }
}

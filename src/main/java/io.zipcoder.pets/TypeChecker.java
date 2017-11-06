package io.zipcoder.pets;

import java.util.Comparator;


    public class TypeChecker implements Comparator<Pet> {

        @Override
        public int compare(Pet a, Pet b) {

            int nameCompare = a.getClass().getSimpleName().compareTo(b.getClass().getSimpleName());

            if(nameCompare == 0){
                return (a.getName().compareTo(b.getName()));
            }
            else {
                return nameCompare;
            }
        }
    }


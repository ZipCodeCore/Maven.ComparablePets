package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PetCompare implements Comparator<Pet>{

        public int compare(Pet pet1, Pet pet2) {
            int compareName = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
            if (compareName == 0) {
                return pet1.getName().compareTo(pet2.getName());
            }
            return compareName;
        }
    }

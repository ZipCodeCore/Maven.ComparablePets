package io.zipcoder;

import java.util.Comparator;
import java.util.Date;

public class Compare implements Comparator<Pet> {

    public int compare(Pet pet1, Pet pet2) {
        Integer result = null;

        String pet1Name = pet1.getName();
        String pet2Name = pet2.getName();

        int nameComparison = pet1Name.compareTo(pet2Name);
        result = nameComparison;

        boolean sameName = (nameComparison == 0);

        if (sameName) {
            Class pet1Class = pet1.getClass();
            Class pet2Class = pet2.getClass();

            String pet1ClassSimpleName = pet1Class.getSimpleName();
            String pet2ClassSimpleName = pet2Class.getSimpleName();

            int classComparison = pet1ClassSimpleName.compareTo(pet2ClassSimpleName);
            result = classComparison;
        }

        return result;
    }
}
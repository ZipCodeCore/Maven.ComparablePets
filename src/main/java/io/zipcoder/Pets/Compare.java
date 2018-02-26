package io.zipcoder.Pets;

import java.util.Comparator;

public class Compare implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {
        String comparableName = o2.getName();
        Class comparableClass = o2.getClass();
        String comparableClassName = comparableClass.getName();

        Class myClass = this.getClass();
        String myClassName = myClass.getName();

        int result = comparableName.compareTo(o1.getName());
        boolean sameName = (result == 0);

        int sameClassResult  = comparableClassName.compareTo(myClassName);
        boolean sameClass = (sameClassResult == 0);

        if(sameClass) {
            return result;
        }
        return sameClassResult * - 1;

    }
}

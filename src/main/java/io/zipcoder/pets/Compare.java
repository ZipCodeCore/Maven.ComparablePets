package io.zipcoder.pets;

import java.util.Comparator;

public class Compare implements Comparator<Pet> {

    @Override
    public int compare(Pet thisPet, Pet anotherPet) {

        String thisPetClass = thisPet.getClass().getSimpleName();
        String otherPetClass = anotherPet.getClass().getSimpleName();
        int result = -(otherPetClass.compareToIgnoreCase(thisPetClass));
        boolean sameClass = (result ==0);

        if (sameClass) {
            String thisPetName = thisPet.getName();
            String otherPetName = anotherPet.getName();
            result = -(otherPetName.compareToIgnoreCase(thisPetName));
        }

        return result;
    }
}

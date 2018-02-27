package io.zipcoder.petfactory;

import io.zipcoder.pets.Pet;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public interface PetFactory {
    Pet makePet(PetInfo p) throws InvalidPetTypeException;
}

package io.zipcoder.petfactory;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class InvalidPetTypeException extends Exception {
    InvalidPetTypeException(PetType p) {
        super(p.getText());
    }
}

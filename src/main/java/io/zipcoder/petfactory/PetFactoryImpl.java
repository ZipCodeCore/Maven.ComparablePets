package io.zipcoder.petfactory;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.KomodoDragon;
import io.zipcoder.pets.Pet;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class PetFactoryImpl implements PetFactory {
    public Pet makePet(PetInfo p) throws InvalidPetTypeException {
        switch (p.type) {
            case CAT:
                return new Cat(p.name);
            case DOG:
                return new Dog(p.name);
            case KOMODODRAGON:
                return new KomodoDragon(p.name);
            default:
                throw new InvalidPetTypeException(p.type);
        }
    }
}

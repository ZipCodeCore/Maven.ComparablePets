package io.zipcoder.petfactory;

import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.KomodoDragon;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: Interfaces
 * author: https://github.com/vvmk
 * date: 2/26/18
 */
public class PetFactoryImplTest {
    PetFactory petFactory;

    @Before
    public void setup() {
        petFactory = new PetFactoryImpl();
    }

    @Test
    public void testMakeDog() {
        Pet dog;
        String expected, actual;
        try {
            dog = petFactory.makePet(new PetInfo("sparky", PetType.DOG));
            expected = Dog.class.getTypeName();
            actual = dog.getClass().getTypeName();

            Assert.assertEquals(expected, actual);
            Assert.assertEquals("sparky", dog.getName());
        } catch (InvalidPetTypeException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testMakeCat() {
        Pet cat;
        String expected, actual;
        try {
            cat = petFactory.makePet(new PetInfo("sparky", PetType.CAT));
            expected = Cat.class.getTypeName();
            actual = cat.getClass().getTypeName();

            Assert.assertEquals(expected, actual);
            Assert.assertEquals("sparky", cat.getName());
        } catch (InvalidPetTypeException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testMakeKomodoDragon() {
        Pet dragon;
        String expected, actual;
        try {
            dragon = petFactory.makePet(new PetInfo("sparky", PetType.CAT));
            expected = KomodoDragon.class.getTypeName();
            actual = dragon.getClass().getTypeName();

            Assert.assertEquals(expected, actual);
            Assert.assertEquals("sparky", dragon.getName());
        } catch (InvalidPetTypeException e) {
            Assert.fail(e.getMessage());
        }
    }
}
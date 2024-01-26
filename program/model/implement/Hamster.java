package task_prgm.model.implement;

import task_prgm.model.AbstractPet;
import task_prgm.model.AnimalGenius;

import java.time.LocalDate;

public class Hamster extends AbstractPet {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.HAMSTER);
    }
}

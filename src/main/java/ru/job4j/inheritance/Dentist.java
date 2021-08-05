package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private boolean tooth;

    public Dentist(String name, String surname,
                   String education, Date birthday,
                   int level, boolean tooth) {
        super(name, surname, education, birthday, level);
        this.tooth = tooth;
    }

    public boolean isTooth() {
        return tooth;
    }
}

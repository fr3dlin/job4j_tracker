package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {
    private boolean scalpel;

    public Surgeon(String name, String surname, String education, Date birthday, int level, boolean scalpel) {
        super(name, surname, education, birthday, level);
        this.scalpel = scalpel;
    }

    public void setScalpel(boolean scalpel) {
        this.scalpel = scalpel;
    }
}

package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {
    private int level;

    public Doctor(String name, String surname, String education, Date birthday, int level) {
        super(name, surname, education, birthday);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

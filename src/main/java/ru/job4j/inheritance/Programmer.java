package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {
    private boolean coding;

    public Programmer(String name, String surname, String education, Date birthday, String project, boolean coding) {
        super(name, surname, education, birthday, project);
        this.coding = coding;
    }

    public void setCoding(boolean coding) {
        this.coding = coding;
    }
}

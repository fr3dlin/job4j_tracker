package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {
    private String project;

    public Engineer(String name, String surname, String education, Date birthday, String project) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public String getProject() {
        return project;
    }
}

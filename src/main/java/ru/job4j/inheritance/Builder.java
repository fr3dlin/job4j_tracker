package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {
    private boolean building;

    public Builder(String name,
                   String surname,
                   String education,
                   Date birthday,
                   String project,
                   boolean building) {
        super(name, surname, education, birthday, project);
        this.building = building;
    }

    public boolean isBuilding() {
        return building;
    }
}

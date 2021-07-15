package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stdu = new Student();
        stdu.setFio("Arsenev Petr Mickhailovich");
        stdu.setGroup("AP32");
        stdu.setDate(new Date());

        System.out.println(stdu.getFio() + " in group - " + stdu.getGroup());
        System.out.println(stdu.getDate());
    }
}

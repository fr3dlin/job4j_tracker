package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle aircraft = new Aircraft();
        Vehicle[] vehicles = new Vehicle[]{bus, train, aircraft};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

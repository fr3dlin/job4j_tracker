package ru.job4j.poly;

public class Bus implements Transport {
    private int passenger;

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void passenger(int count) {
        passenger = count;
    }

    @Override
    public double refuel(double count) {
        return count * 40;
    }
}

package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error er1 = new Error();
        Error er2 = new Error(true, 400, "Bad URL");
        Error er3 = new Error(true, 500, "Not found");
        er1.printError();
        er2.printError();
        er3.printError();
    }
}

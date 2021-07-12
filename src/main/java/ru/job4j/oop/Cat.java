package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name + " eat " + this.food);
    }

    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat perry = new Cat();
        String say = perry.sound();
        System.out.println("Perry says " + say);
        perry.giveNick("Perry");
        perry.eat("kotleta");
        perry.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}

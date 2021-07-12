package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спят усталые игрушки, книжки спят");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox mbox = new Jukebox();
        mbox.music(1);
        mbox.music(2);
        mbox.music(10);
    }
}

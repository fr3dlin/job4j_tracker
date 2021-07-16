package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игра 11.");
            boolean turn = true;
            int count = 11;
            while (count > 0) {
                String player = turn ? "Первый игрок" : "Второй игрок";
                System.out.println(player + " введите число от 1 до 3:");
                int matches = Integer.parseInt(input.nextLine());
                if (matches > 0 && matches < 4) {
                    count -= matches;
                    turn = !turn;
                    System.out.println("Осталось спичек: " + count);
                }
            }
            if (turn) {
                System.out.println("Выиграл второй игрок");
            } else {
                System.out.println("Выиграл первый игрок");
            }
            System.out.println("Повторить? Да/Нет");
            String answer = input.nextLine();
            if (answer.equals("Нет")) {
                run = false;
            }
        }
    }
}
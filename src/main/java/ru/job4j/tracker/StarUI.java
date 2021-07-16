package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StarUI {
    public static void main(String[] args) {
        Item item = new Item();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

        Item item1 = new Item(1, "table");
        System.out.println(item1.toString());
    }
}

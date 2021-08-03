package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("partsentev@yandex.ru", "Petr Arsentev");
        map.put("fredlin@yandex.ru", "Pavel Kulagin");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}

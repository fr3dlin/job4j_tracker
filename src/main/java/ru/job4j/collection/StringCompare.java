package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl;
        for (int index = 0; index < o1.length(); index++) {
            if (index < o2.length()) {
                rsl = Character.compare(o1.charAt(index), o2.charAt(index));
            } else {
                rsl = 1;
            }
            if (rsl != 0) return rsl;
        }
        return Integer.compare(o1.length(), o2.length());
    }
}

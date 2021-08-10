package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] leftStr = o1.split(". ");
        String[] rightStr = o2.split(". ");
        int left = Integer.parseInt(leftStr[0]);
        int right = Integer.parseInt(rightStr[0]);
        return Integer.compare(left, right);
    }
}
